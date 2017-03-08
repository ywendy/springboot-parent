package com.wendy.springboot.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tony.
 * @since 1.7
 */
@Controller
public class HelloController {
    /**
     * freemarker 默认路径：#spring.freemarker.template-loader-path=["classpath:/templates/"]
     * 在application.properties 文件中修改.
     * @param modelMap
     * @return
     */
    @RequestMapping("/")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("host", "http://ywendy.github.io");
        return "index";
    }
}
