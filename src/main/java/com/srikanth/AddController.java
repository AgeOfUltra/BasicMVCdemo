package com.srikanth;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
    @RequestMapping("/add")
    public ModelAndView addNum(@RequestParam("value1") int i, @RequestParam("value2") int j){
        System.out.println("Checking...");
        AddServices addServices = new AddServices();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("sum", addServices.add(i, j));
        return mv;
    }
}
