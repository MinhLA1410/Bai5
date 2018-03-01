package b5;

public class Project extends Work{
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public void input() {
		System.out.println(n);
		
	}

	@Override
	public void display() {
		System.out.println("hi");
		
	}
	
	
}
