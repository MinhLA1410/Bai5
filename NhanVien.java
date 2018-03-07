package project;

public abstract class NhanVien {
	
	private String name;
	private String address;
	private int age;
	private String bophan;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBophan() {
		return bophan;
	}
	public void setBophan(String bophan) {
		this.bophan = bophan;
	}
	
	abstract double tinhluong();
	abstract void hienthi();
	abstract void nhap();
}
