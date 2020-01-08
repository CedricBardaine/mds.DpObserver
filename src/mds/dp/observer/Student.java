package mds.dp.observer;

public class Student implements Observer {
	private String name; 
	
	
	public Student(String name) {
		this.name = name ; 
	}
	
	
	@Override
	public void update(String msg) {
		System.out.println(msg +" "+this.name + " sort de la classe...");
	}

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }
	
	

}
