package patientproject;

public class Doctor extends Person {
	private String Speciality;
	public Doctor(String name, int age, String Speciality) {
		super(name,age);
		this.Speciality= Speciality;
	}
	public String getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(String Speciality) {
		this.Speciality=Speciality;
	}
	@Override
	public void displayInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getSpeciality());
		
	}
	}
 


