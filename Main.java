package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<CongNhan> cnlist;
	public static ArrayList<CanBoQuanLy> cblist;
	
	public static void inputInformCongNhan(int n){
		
		for(int i=0; i<n; i++){
			cnlist.get(i).nhap();
		}
	}
	public static void inputInformQuanLy(int m){
		
		for(int i=0; i<m; i++){
			cblist.get(i).nhap();
		}
	}
	
//	public static void Sort(){
//		cnlist.sort((cn1,cn2) -> {
//			return cn1.tinhluong() - cn2.tinhluong() >= 0 ? 1 : 0;
//		});
//	}
//	public static void Sort1(){
//		cblist.sort((cb1,cb2) -> {
//			return cb1.tinhluong() - cb2.tinhluong() >= 0 ? 1 : 0;
//		});
//	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		cnlist = new ArrayList<>(n);
		cblist = new ArrayList<>(m);
		
		Main.inputInformCongNhan(n);
		Main.inputInformQuanLy(m);
		
		for(int i=0; i<n; i++){
			cnlist.get(i).hienthi();
		}
		for(int i=0; i<m; i++){
			cblist.get(i).hienthi();
		}
		
//		Main.Sort();
//		Main.Sort1();
		
		cnlist.sort((cn1,cn2) -> {
			return cn1.tinhluong() - cn2.tinhluong() >= 0 ? 1 : 0;
		});
		cblist.sort((cb1,cb2) -> {
			return cb1.tinhluong() - cb2.tinhluong() >= 0 ? 1 : 0;
		});
		
		System.out.println("Cong nhan luong min: " + cnlist.get(0).toString());
		System.out.println("Cong nhan luong max: " + cnlist.get(n).toString());
		System.out.println("Can bo luong min: " + cnlist.get(0).toString());
		System.out.println("Can bo luong max: " + cnlist.get(m).toString());
	}
}