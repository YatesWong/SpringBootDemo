package com.frank.chapter33.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jianweilin on 2017/10/11.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(ModelMap map) {
        map.addAttribute("host","http://www.jianwl.com");
        return "index";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home() {
        return "login";
    }
}
