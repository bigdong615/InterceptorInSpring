package springmvc_07_Interceptor.intercepterTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class InterceptorController {
	@RequestMapping("/interceptor")
	@ResponseBody
	public String testFunction() {
		System.out.println("�������еķ���ִ����");
		return "hello";
	}
}
