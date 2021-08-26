package cn.shaonianyou.tacocloud.dao.impl;

import cn.shaonianyou.tacocloud.dao.IngredientRepository;
import cn.shaonianyou.tacocloud.model.po.IngredientPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 配料DaoJDBC实现
 * @date 2021/8/26
 **/
@Repository
public class JdbcIngredientRepository implements IngredientRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public Iterable<IngredientPO> findAll() {
        return jdbcTemplate.query("select id, name, type from Ingredient", this::mapRowToIngredientPO);
    }

    /**
     * 根据Id查询单条
     *
     * @param id Id
     * @return
     */
    @Override
    public IngredientPO findOne(Long id) {
        return jdbcTemplate.queryForObject("select id, name, type from Ingredient where id = ?", this::mapRowToIngredientPO, id);
    }

    /**
     * 保存
     *
     * @param ingredientPO 配料数据
     * @return
     */
    @Override
    public IngredientPO save(IngredientPO ingredientPO) {
        jdbcTemplate.update("insert into Ingredient (id, name, type) values (?, ?, ?)",
                ingredientPO.getId(),
                ingredientPO.getName(),
                ingredientPO.getType());
        return ingredientPO;
    }

    /**
     * 查询结果转换为PO
     *
     * @param rs     查询结果集
     * @param rowNum 数量
     * @return
     * @throws SQLException
     */
    private IngredientPO mapRowToIngredientPO(ResultSet rs, int rowNum) throws SQLException {
        return new IngredientPO(
                rs.getString("id"),
                rs.getString("name"),
                rs.getString("type")
        );
    }

}
