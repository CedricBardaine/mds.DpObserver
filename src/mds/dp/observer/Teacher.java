package mds.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Subject, Observer{
	private String name ;
	private List<Observer> observers = new ArrayList<Observer>() ;
	
	

	public Teacher(String string) {
		this.name = string ; 
	}

	@Override
	public void attach(Observer unOb) {
		if (!this.observers.contains(unOb)) 
			this.observers.add(unOb);		
	}

	@Override
	public void detach(Observer unOb) {
		if (this.observers.contains(unOb)) 
			this.observers.remove(unOb);	
		
	}

	@Override
	public void notifyEvent(String msg) {
		for (Observer observer : observers) {
			observer.update(msg);
		}
		
	}
	
	
	@Override
	public void update(String msg) {
		System.out.println("Je suis Mr. "+this.name+" et je suis au courant qu'il y a une alarme.");
		notifyEvent(msg);
	}


	
	//!!!! getters setters 
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public List<Observer> getObservers() { return observers; }

	public void setObservers(List<Observer> observers) { this.observers = observers; }


}
