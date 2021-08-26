package cn.shaonianyou.tacocloud.service.impl;

import cn.shaonianyou.tacocloud.dao.IngredientRepository;
import cn.shaonianyou.tacocloud.model.dto.IngredientDTO;
import cn.shaonianyou.tacocloud.model.vo.IngredientVO;
import cn.shaonianyou.tacocloud.service.IngredientService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 配料ServiceImpl
 * @date 2021/8/26
 **/
@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired

    private IngredientRepository ingredientRepository;

    /**
     * 全部配料列表
     *
     * @return
     */
    @Override
    public List<IngredientVO> findAll() {
        List<IngredientVO> ingredientVOList = new ArrayList<>();
        ingredientRepository.findAll().forEach(x -> {
            IngredientVO ingredientVO = new IngredientVO();
            BeanUtils.copyProperties(x, ingredientVO);
            ingredientVOList.add(ingredientVO);
        });
        return ingredientVOList;
    }

    /**
     * 根据Id查询单个配料
     *
     * @param id Id
     * @return
     */
    @Override
    public IngredientVO findOne(Long id) {
        return null;
    }

    /**
     * 保存配料
     *
     * @param ingredientDTO 配料数据
     * @return
     */
    @Override
    public IngredientVO save(IngredientDTO ingredientDTO) {
        return null;
    }
}
