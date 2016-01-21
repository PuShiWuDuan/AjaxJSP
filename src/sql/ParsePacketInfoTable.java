package sql;

public class ParsePacketInfoTable {

	private int id;
	private double rank;
	private String name;
	private String info;
	
	public ParsePacketInfoTable(int id,int rank,String name,String info)
	{
		this.id=id;
		this.rank=rank;
		this.name=name;
		this.info=info;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getrank() {
		return rank;
	}
	public void setrank(double rank) {
		this.rank = rank;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
