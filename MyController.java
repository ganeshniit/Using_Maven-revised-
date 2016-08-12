package pyramid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController {
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("i am in home");
		return "home";
	}
	@RequestMapping("/signup")
	public String signup()
	{
		System.out.println("i am in signup");
		return "signup";
	}
	@RequestMapping("/login")
	public String login()
	{
		System.out.println("i am in login");
		return "login";
	}
}
