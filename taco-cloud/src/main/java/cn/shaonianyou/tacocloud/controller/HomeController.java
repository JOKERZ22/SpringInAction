package cn.shaonianyou.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 主页
 * @date 2021/8/25
 **/
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
