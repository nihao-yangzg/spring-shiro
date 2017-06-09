package backup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backup.bean.User;
import backup.dao.UserMapper;


@Service
public class UserService {
	/**
	 * userMapper object.
	 */
	@Autowired
	private  UserMapper userMapper;
	
	/**
	 * get all user in database.
	 * @return List<User>
	 */
	public List<User> getAllUsers() {
		List<User> userlist = userMapper.getAllUsers();
		return userlist;
	}
	
	/**
	 * get user by username.
	 * @param username String
	 * @return User
	 */
	public User getUserByName(String username) {
		System.out.println(userMapper==null);
		User user = userMapper.getUser(username);
		return user;
	}
	
	/**
	 * lock user.
	 * @param username String
	 */
	public void lockUser(String username) {
		userMapper.lockUser(username);
	}
	
	/**
	 * unlock user.
	 * @param username String
	 */
	public void unlockUser(String username) {
		userMapper.unlockUser(username);
	}
}
