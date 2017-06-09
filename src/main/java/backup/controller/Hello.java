package backup.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import backup.bean.User;
//import backup.rest.exception.ForbiddenException;
import backup.rest.exception.UnauthorizedException;
import backup.service.UserService;

@Controller
@ResponseBody
@RequestMapping("/hello")
public class Hello {
	private Logger logger = LoggerFactory.getLogger(Hello.class);
	
	
	@Autowired
	private UserService userService;
	/**
	 * for test.
	 * @return User
	 */
	@RequestMapping(value="/sayhello", method=RequestMethod.GET)
	public  User sayHello(){
		User user = new User();
		user.setLocked(false);
		user.setPassword("11234");
		user.setUsername("zhangsan");
//		throw new ForbiddenException();
		throw new UnauthorizedException();
//		return user;
	}
	/**
	 * get all users.
	 * @return List<User>
	 */
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getAllUsers() {
		this.logger.info("request /hello/users/");
		List<User> ulist = userService.getAllUsers();
		System.out.println(ulist.toString());
		return ulist;
	}
	
	/**
	 * get user by name
	 */
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public User getUserByName() {
		User user = userService.getUserByName("admin");
		return user;
	}
}
