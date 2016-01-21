package GlobalConfig;

public class config {
   private static String path = "/home/liujianfei/java_web";
   private static String url = "jdbc:mysql://localhost:3306/ipv6_web";
   private static String usrname = "root";
   private static String password = "ict";
	public config() {
		// TODO Auto-generated constructor stub
	}
	public static String getPath() {
		return path;
	}
	public static void setPath(String path) {
		config.path = path;
	}
	public static String getUrl() {
		return url;
	}
	public static void setUrl(String url) {
		config.url = url;
	}
	public static String getUsrname() {
		return usrname;
	}
	public static void setUsrname(String usrname) {
		config.usrname = usrname;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		config.password = password;
	}

}
