package mds.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Alarme implements Subject{
	private String name ;
	private List<Observer> observers = new ArrayList<Observer>() ;
	
	public Alarme(String string) {
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

}
