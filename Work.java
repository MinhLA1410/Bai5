package b5;

public class Work implements IWork {
	@Override
	public void input() {
		System.out.println("okinput");
		
	}

	@Override
	public void display() {
		System.out.println("okdisplay");
		
	}

	protected String code;
	protected String name;
	protected int duration;
	protected String description;
	
	public Work() {
		super();
	}
	
	public Work(String code, String name, int duration, String description) {
		this.code = code;
		this.name = name;
		this.duration = duration;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
