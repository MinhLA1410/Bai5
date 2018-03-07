package project;

import java.util.Scanner;

public class CanBoQuanLy extends NhanVien{
	
	public static Scanner sc = new Scanner(System.in);
	
	private String chucvu;
	private double hesoluong;
	private double phucap;
	
	public String getChucvu() {
		return chucvu;
	}

	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}

	public double getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(double hesoluong) {
		this.hesoluong = hesoluong;
	}

	public double getPhucap() {
		return phucap;
	}

	public void setPhucap(double phucap) {
		this.phucap = phucap;
	}

	@Override
	void nhap() {
		String name = sc.nextLine();
		setName(name);
		String address = sc.nextLine();
		setAddress(address);
		String a = sc.nextLine();
		int age = Integer.parseInt(a);
		setAge(age);
		String bophan = sc.nextLine();
		setBophan(bophan);
		String chucvu = sc.nextLine();
		setChucvu(chucvu);
		String h = sc.nextLine();
		double hesoluong = Double.parseDouble(h);
		setHesoluong(hesoluong);
		String p = sc.nextLine();
		double phucap = Integer.parseInt(p);
		setPhucap(phucap);
	}

	@Override
	double tinhluong() {
		return hesoluong * 440000 + phucap;
	}

	@Override
	void hienthi() {
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "CanBoQuanLy [chucvu=" + chucvu + ", hesoluong=" + hesoluong + ", phucap=" + phucap + ", tinhluong()="
				+ tinhluong() + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getAge()="
				+ getAge() + ", getBophan()=" + getBophan() + "]";
	}
	
	
}
