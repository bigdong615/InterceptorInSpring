package springmvc_07_Interceptor.intercepterTest.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("uri: " + request.getRequestURI());
		
		if (request.getRequestURI().contains("login")) {
			return true;

		}
		
		HttpSession httpSession = request.getSession();
		if (httpSession.getAttribute("user")!=null) {
			return true;
		}
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		return false;
		
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		
		 System.out.println("------------处理后------------");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
		 System.out.println("------------清理------------");
	}

}
