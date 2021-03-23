package com.jihunh.spring;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/jihunh/*")
@SessionAttributes("soldier")
public class FirstJihun {

	@GetMapping("/first")
	public void first() {}
	
	@PostMapping("/first")
	public String member(Model model, HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		
		String message = name + " " + gender + " " + address + " " + phone;
		
		model.addAttribute("jihunh", message);
		
		System.out.println("출력될 메세지 : " + message);
		
		return "jihunh/result";
	}
	
	@GetMapping("/second")
	public void second() {}
	
	@PostMapping("/second")
	public String militaryInfo(Model model, @RequestParam(required=false) String military, @RequestParam(required=false) String dept,
								@RequestParam(required=false) String add, @RequestParam(required=false) String longtime) {
	
	String message = military + " " + dept + " " + add + " " + longtime;
	
	model.addAttribute("jihunh", message);
	
	System.out.println("출력될 메세지 : " + message);
	
	return "jihunh/result";
	
	}
	
	@PostMapping("/second02")
	public String militalyInfo2(Model model, @RequestParam Map<String, String> parameters) {
		
		String mili = parameters.get("military");
		String dept = parameters.get("dept");
		String add = parameters.get("add");
		String longtime = parameters.get("longtime");
		
		String message = mili + " " + dept + " " + add + " " + longtime;
		
		model.addAttribute("jihunh", message);
		
		System.out.println("출력될 메세지 : " + message);
		
		return "jihunh/result";
	}
	
	@GetMapping("third")
	public void third() {}
	
	@PostMapping("third")
	public String showMe(@ModelAttribute("military") MilitaryDTO military) {
		
		System.out.println(military);
		
		return "jihunh/result2";
	}
	
	@GetMapping("login")
	public void login() {}
	
	@PostMapping("third1")
	public String gobackArmy(HttpServletRequest request, @RequestParam String soldier, @RequestParam String division) {
		
		request.getSession().setAttribute("soldier", soldier);
		request.getSession().setAttribute("division", division);
		
		System.out.println("랜덤박스 : " + request.getSession());
		
		return "jihunh/result2";
	}
	
	@GetMapping("logout1")
	public String logout1(HttpSession session) {
		
		session.invalidate();

		System.out.println("탈영1");
		
		return "jihunh/result2";
	}
	
	
	@PostMapping("third2")
	public String gobackArmy2(Model model, @RequestParam String soldier) {
		
		model.addAttribute("soldier", soldier);
		
		
		return "jihunh/result2";
	}
	
	@GetMapping("logout2")
	public String logout2(SessionStatus sessionStatus) {
		
		sessionStatus.setComplete();
		
		System.out.println("탈영2");
		
		return "jihunh/result2";
	}
	
	@GetMapping("fourth")
	public void fourth() {}
	
	@PostMapping("fourth")
	public String lastPang(@RequestBody String body, @RequestHeader("content-type") String contentType,
							@CookieValue("JSESSIONID") String sessionId) {
		
		System.out.println(body);
		System.out.println(contentType);
		System.out.println(sessionId);
		
		return "jihunh/result2";
	}
}
























