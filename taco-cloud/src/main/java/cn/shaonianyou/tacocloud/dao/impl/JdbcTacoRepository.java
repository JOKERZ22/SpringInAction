package cn.shaonianyou.tacocloud.dao.impl;

import cn.shaonianyou.tacocloud.dao.TacoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author wei.zhang
 * @version 1.0
 * @description TacoDaoJDBC实现
 * @date 2021/8/26
 **/
@Repository
public class JdbcTacoRepository implements TacoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

}
