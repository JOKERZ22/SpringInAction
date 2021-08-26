package cn.shaonianyou.tacocloud.service;

import cn.shaonianyou.tacocloud.model.dto.IngredientDTO;
import cn.shaonianyou.tacocloud.model.vo.IngredientVO;

import java.util.List;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 配料Service
 * @date 2021/8/26
 **/
public interface IngredientService {

    /**
     * 全部配料列表
     *
     * @return
     */
    List<IngredientVO> findAll();

    /**
     * 根据Id查询单个配料
     *
     * @param id Id
     * @return
     */
    IngredientVO findOne(Long id);

    /**
     * 保存配料
     *
     * @param ingredientDTO 配料数据
     * @return
     */
    IngredientVO save(IngredientDTO ingredientDTO);
}
