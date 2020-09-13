package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    /**
     * @ResponseBody 用于将返回值以json的形式返回
     * @RequestMapping 用于标注这个Controller接受什么URL
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
