package sql;

public class TestinfoTable {

		private String id;
		private String time;
		private String type;
		private String info;
		
		public TestinfoTable(String id2,String time2,String type,String info)
		{
			this.id=id2;
			this.time=time2;
			this.type=type;
			this.info=info;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
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
