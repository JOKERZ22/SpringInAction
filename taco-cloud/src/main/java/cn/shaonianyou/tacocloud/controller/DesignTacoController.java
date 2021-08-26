package cn.shaonianyou.tacocloud.controller;

import cn.shaonianyou.tacocloud.constant.enums.IngredientTypeEnum;
import cn.shaonianyou.tacocloud.model.dto.TacoDTO;
import cn.shaonianyou.tacocloud.model.vo.IngredientVO;
import cn.shaonianyou.tacocloud.service.IngredientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 定制Taco
 * @date 2021/8/26
 **/
@Controller
@RequestMapping("/design")
@Slf4j
public class DesignTacoController {

    @Autowired
    private IngredientService ingredientService;

    /**
     * 配件列表
     *
     * @param model 视图
     * @return
     */
    @GetMapping
    public String showDesignForm(Model model) {
        List<IngredientVO> ingredientList = ingredientService.findAll();
        IngredientTypeEnum[] types = IngredientTypeEnum.values();
        for (IngredientTypeEnum type : types) {
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredientList, type));
        }
        model.addAttribute("design", new TacoDTO());
        return "design";
    }

    /**
     * 处理定制Taco
     *
     * @param tacoDTO Taco定制表单
     * @param errors  校验错误
     * @return
     */
    @PostMapping
    public String processDesign(@Valid TacoDTO tacoDTO, Errors errors) {
        if (errors.hasErrors()) {
            return "design";
        }
        log.info("Processing TacoDesign {}", tacoDTO);
        return "redirect:/orders/current";
    }

    /**
     * 根据配料类型对配件列表进行分组
     *
     * @param ingredientList 配料列表
     * @param type           配料类型
     * @return
     */
    private List<IngredientVO> filterByType(List<IngredientVO> ingredientList, IngredientTypeEnum type) {
        return ingredientList.stream().filter(x -> type.name().equals(x.getType())).collect(Collectors.toList());
    }
}
