package com.jihunh.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class Main {

	@RequestMapping("/main")
	public void main() {}
	
}
