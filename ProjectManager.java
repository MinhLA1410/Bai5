package b5;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectManager {
//	private static Work pj[];
	public static ArrayList<Project> wk = new ArrayList<>();
//	public static void Input1(int c) {
//		Scanner sc = new Scanner(System.in);
//		pj = new Project[c];
//		for(int i=0; i<c; i++) {
//			String code = sc.nextLine();
//			pj[i].setCode(code);
//			String name = sc.nextLine();
//			pj[i].setName(name);
//			int duration = sc.nextInt();
//			pj[i].setDuration(duration);
//			String description = sc.nextLine();
//			pj[i].setDescription(description);
//			int n = sc.nextInt();
//			((Project) pj[i]).setN(n);
//		}	
//	}
	
	public static void Input2() {
		Scanner sc = new Scanner(System.in);
		wk.add((Project) new Work("1","student", 18, "sinh vien"));
		wk.add((Project) new Work("2","employee", 25, "nhân viên"));
		wk.add((Project) new Work("3","manger", 30, "sếp"));
		
		for(int i=0; i<wk.size(); i++) {
			int m = sc.nextInt();
			wk.ad
	}
	
	public static void Sort() {
		
			}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chon;
		do {
			System.out.println("1. Input");
			System.out.println("2. Display");
			System.out.println("3. Sort");
			System.out.println("4. Search");
			System.out.println("5. Exit");
			chon = sc.nextInt();
			switch (chon) {
			case 1:{
				int c = sc.nextInt();
//				ProjectManager.Input(c);
				break;
			}
			case 2:{
				ProjectManager.Sort();
				break;
			}
			case 3:{
				
				break;
			}
			case 4:{
				break;
			}
			case 5:{
				System.exit(0);
			}
			}
		} while (chon!=0);
	}
}
