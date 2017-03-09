package com.springdemo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/a")
@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/b")
    public String index(Model modelSS,
    		@RequestParam(value="aa")String xx){
		System.out.println(xx);
		modelSS.addAttribute("name", "¸ð³ô³ô");
        return "view";
    }
}