package sql;

public class InfoCapturePacketTable {

	public InfoCapturePacketTable() {
		// TODO Auto-generated constructor stub
	}
	private int cid;
	private int id;
	private String info_packet;
	
	public InfoCapturePacketTable(int cid,int id,String info_packet)
	{
		this.cid=cid;
		this.id=id;
		this.info_packet=info_packet;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInfo_packet() {
		return info_packet;
	}
	public void setInfo_packet(String info_packet) {
		this.info_packet = info_packet;
	}
}
