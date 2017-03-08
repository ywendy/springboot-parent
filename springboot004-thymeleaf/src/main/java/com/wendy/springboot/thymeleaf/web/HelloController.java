package com.wendy.springboot.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static javafx.scene.input.KeyCode.R;

/**
 * @author tony.
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("host","127.0.0.1");
        return "index";
    }
}
