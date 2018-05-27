package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author stevenxy E-mail:random_xy@163.com
* @Date 2018年5月27日
* @Description 
* 1、不用实现Controller接口
* 2、方法名不做要求,返回值可以是ModelAndView,也可以是String
* 3、可以添加多个方法
* 4、使用@Controller
* 5、可以在方法或者类前添加@RequestMapping(相当于HandlerMapping)
*/
@Controller
public class HelloController {
	
	@RequestMapping("/hello.do")
	public String hello() {
		
		System.out.println("hello()");
		return "hello";
	}
}
