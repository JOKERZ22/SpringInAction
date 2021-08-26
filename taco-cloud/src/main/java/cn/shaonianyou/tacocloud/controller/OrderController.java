package cn.shaonianyou.tacocloud.controller;

import cn.shaonianyou.tacocloud.model.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 订单
 * @date 2021/8/26
 **/
@Controller
@RequestMapping("/orders")
@Slf4j
public class OrderController {

    /**
     * 当前订单
     *
     * @param model 视图
     * @return
     */
    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("order", new OrderDTO());
        return "orderForm";
    }

    /**
     * 处理订单
     *
     * @param orderDTO 订单表单
     * @param errors   校验错误
     * @return
     */
    @PostMapping
    public String processOrder(@Valid OrderDTO orderDTO, Errors errors) {
        if (errors.hasErrors()) {
            return "orderForm";
        }
        log.info("Order submitted: {}", orderDTO);
        return "redirect:/";
    }
}
