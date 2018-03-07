package project;

import java.util.Scanner;

public class CongNhan extends NhanVien{
	
	public static Scanner sc = new Scanner(System.in);
	
	private double luongthang;
	private int songaylam;
	
	public double getLuongthang() {
		return luongthang;
	}

	public void setLuongthang(double luongthang) {
		this.luongthang = luongthang;
	}

	public int getSongaylam() {
		return songaylam;
	}

	public void setSongaylam(int songaylam) {
		this.songaylam = songaylam;
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
		String l = sc.nextLine();
		double luongthang = Double.parseDouble(l);
		setLuongthang(luongthang);
		String s = sc.nextLine();
		int songaylam = Integer.parseInt(s);
		setSongaylam(songaylam);
	}

	@Override
	double tinhluong() {
		return (luongthang * songaylam) / 26;
//		System.out.println((luongthang * songaylam) / 26);
	}

	@Override
	void hienthi() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "CongNhan [luongthang=" + luongthang + ", songaylam=" + songaylam + ", tinhluong()=" + tinhluong()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getAge()=" + getAge()
				+ ", getBophan()=" + getBophan() + "]";
	}
	
}
