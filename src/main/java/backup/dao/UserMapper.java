package backup.dao;

import java.util.List;


import backup.bean.User;

public interface UserMapper {
	/**
	 * get user by username.
	 */
	public User getUser(String username);
	
	/**
	 * set new password, update password create time.
	 */
	public void updatePwd(User user);
		
	/**
	 * fetch all users.
	 */
	public List<User> getAllUsers();
	
	/**
	 * lock user.
	 */
	public void lockUser(String username);
	
	/**
	 * unlock user.
	 */
	public void unlockUser(String username);
	
	
}
