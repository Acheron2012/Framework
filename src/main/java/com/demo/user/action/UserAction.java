package com.demo.user.action;

import com.demo.bean.UserBean;
import com.demo.user.service.UserService;
import com.demo.utils.redis.RedisOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserAction {
	
	public static Logger logger = LoggerFactory.getLogger(UserAction.class);
	
	@Resource UserService userService;
	@Resource RedisOperation redisOperation;
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String createUser(HttpServletRequest request,HttpServletResponse response,UserBean userBean)
	{
		System.out.println("中文测试");
		userService.insertUser(userBean);
		return "index";
	}
	
}
