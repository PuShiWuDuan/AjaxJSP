package sql;

public class Test_info {

		private int id;
		private double time;
		private String type;
		private String info;
		
		public Test_info(int id,double time,String type,String info)
		{
			this.id=id;
			this.time=time;
			this.type=type;
			this.info=info;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getTime() {
			return time;
		}
		public void setTime(double time) {
			this.time = time;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getInfo() {
			return info;
		}
		public void setInfo(String info) {
			this.info = info;
		}
}
