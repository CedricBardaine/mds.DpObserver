package mds.dp.observer;

public interface Subject {
	void attach(Observer unOb) ;
	void detach(Observer unOb) ; 
	void notifyEvent(String msg) ; 
}
