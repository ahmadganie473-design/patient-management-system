package patientproject;
public class Patient  extends Person{

private int patientId;
private static int nextId=1001;
private String illness;
public Patient(String name,int age,int patientId) {
	super(name,age);
	this.patientId=patientId;

}


public  int getPatientId() {
	return patientId;
}
public Patient(String name,int age,String illness) {
	super(name,age);
	this.illness=illness;
	patientId=nextId;
	nextId++;
	
}
public String getillness() {
	return illness;
}
public void setIllness(String illness) {
	this.illness=illness;
}

public void displayPatientInfo() {
	System.out.println("Name: "+ getName());
	System.out.println("Age: "+ getAge());
	System.out.println("Illness: "+ getillness());
	
}
@Override
public void displayInfo() {
	System.out.println( "Patient id:"+getPatientId());
	System.out.println(getName()+","+getAge()+","+getillness());
	
}
}


