package com.pro.wing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/base")
	@ResponseBody
	public String handelController() {
		
		return ">>>>>>>>>>>>>>Wellcome to SpringBoot Project<<<<<<<<<<<<<<<<<<<";
	}

}
