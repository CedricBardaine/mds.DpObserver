package mds.dp.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		
//		Teacher mick = new Teacher("Mickael") ; 
//		
//		Student jerem = new Student("Jerem") ; 
//		Student cedric = new Student("Cedric") ; 
//		Student eloise = new Student("Eloise") ; 
//		Student mathieu = new Student("Mathieu") ; 
//		
//		mick.attach(jerem);
//		mick.attach(cedric);
//		mick.attach(eloise);
//		
//		mick.notifyEvent("C fini !");
		
		// Avec un batiment
		
		Alarme alarmeDuBatiment = new Alarme("alarme1") ; 
		
		Teacher mickael = new Teacher("Mickael") ; 
		Teacher jonathan = new Teacher("Jonathan") ; 
		Teacher regis = new Teacher("Régis") ; 
		
		Student alexis = new Student("Alexis"); 
		Student dylan = new Student("Dylan"); 
		Student clement = new Student("Clement"); 
		Student naig = new Student("Naig"); 
		Student melvyn = new Student("Melvyn"); 
		
		alarmeDuBatiment.attach(mickael);
		alarmeDuBatiment.attach(jonathan);
		alarmeDuBatiment.attach(regis);
		
		mickael.attach(alexis);
		mickael.attach(dylan);
		mickael.attach(clement);
		jonathan.attach(naig);
		jonathan.attach(melvyn);
		
		alarmeDuBatiment.notifyEvent("ALEEERTE");
	}

}
