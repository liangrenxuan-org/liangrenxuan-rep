package entity;

public class City {
	
	private Integer id;
	private Integer pid;
	private String name;
	private Byte open;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Byte getOpen() {
		return open;
	}
	public void setOpen(Byte open) {
		this.open = open;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", pid=" + pid + ", name=" + name + ", open=" + open + "]";
	}
	
	

}
