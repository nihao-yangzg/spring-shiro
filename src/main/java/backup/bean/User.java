package backup.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable{
	private static final long serialVersionUID = 360707152970234390L;
	private String username;
	private String password;
	private Timestamp createTime;
	private boolean locked;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean islocked) {
		this.locked = islocked;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	
}
