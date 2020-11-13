package springmvc_07_Interceptor.intercepterTest.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@RequestMapping(value = "/jumplogin")
	public String jumpLogin() throws Exception {

		return "login";

	}

	@RequestMapping(value = "/jumpSuccess")
	public String jumpSuccess() throws Exception {

		return "success";
	}

	@RequestMapping("/login")
	public String login(HttpSession httpSession, String username, String pwd) {
		httpSession.setAttribute("user", username);
		return "success";

	}
	@RequestMapping("/logout")
	public String logout(HttpSession httpSession) throws Exception {

		httpSession.invalidate();
		return "login";

	}

}
