package com.zonda.resolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 类名称：MyExceptionResolver.java 类描述：
 * 
 * @author FH 作者单位： 联系方式：QQ313596790
 * @version 1.0
 */
public class MyExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub
		System.out.println("---Exception------------------异常开始------------------Exception---");
		ex.printStackTrace();
		System.out.println("---Exception------------------异常结束------------------Exception---");
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex.toString().replaceAll("\n", "<br/>"));
		return mv;
	}

}
