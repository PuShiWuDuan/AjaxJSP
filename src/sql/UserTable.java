package sql;

public class UserTable {

	public UserTable() {
		// TODO Auto-generated constructor stub
	}
	private String username;
	private String password;
	
	public UserTable(String username,String password)
	{
		this.setUsername(username);
		this.setPassword(password);
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
