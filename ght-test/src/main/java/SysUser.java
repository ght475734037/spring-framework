/**
 * @author Administrator
 * @title: SysUser
 * @projectName spring
 * @description: TODO
 * @date 2020/12/8/000814:22
 */
public class SysUser {

	private String username;
	private String password;

	public SysUser() {
	}

	public SysUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

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
}
