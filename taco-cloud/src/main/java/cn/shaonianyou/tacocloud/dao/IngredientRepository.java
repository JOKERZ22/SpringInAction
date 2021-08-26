package cn.shaonianyou.tacocloud.dao;

import cn.shaonianyou.tacocloud.model.po.IngredientPO;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 配料Dao
 * @date 2021/8/26
 **/
public interface IngredientRepository {

    /**
     * 查询全部
     *
     * @return
     */
    Iterable<IngredientPO> findAll();

    /**
     * 根据Id查询单条
     *
     * @param id Id
     * @return
     */
    IngredientPO findOne(Long id);

    /**
     * 保存
     *
     * @param ingredientPO 配料数据
     * @return
     */
    IngredientPO save(IngredientPO ingredientPO);

}
