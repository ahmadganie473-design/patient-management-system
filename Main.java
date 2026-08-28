package patientproject;
import java.util.*;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<Patient> patients = new ArrayList<>();
		Scanner patientss = new Scanner(System.in);
		Scanner update = new Scanner(System.in);
		for(int i =0;i<100;i++) {
		int choice;
		System.out.println("===== Patient Management System =====");
		System.out.println("1. Add Patient");
		System.out.println("2. View All Patients");
		System.out.println("3. Search For Patient");
		System.out.println("4. Remove Patient");
		System.out.println("5. Update Patient");
		System.out.println("6. Exit");
		System.out.print("Enter your choice: ");
		choice=patientss.nextInt();
		patientss.nextLine();
		if(choice<1||choice>6) {
			System.out.println("Invalid Choice");
		}
		if(choice==1) {
			System.out.println(" __Add Patient Selected__");
			System.out.print("Patient name: ");
			String name =patientss.nextLine();
			if(name.isEmpty()) {
				System.out.println("Invalid Name");
				continue;
			}
			System.out.print("Enter Age: ");
			int age = patientss.nextInt();
			patientss.nextLine();
			if(age<0||age>120) {
				System.out.println("Invalid age");
				continue;
			}
			System.out.print("Enter Illness: ");
			String illness = patientss.nextLine();
			if(illness.isEmpty()) {
				System.out.println("Invalid Illness");
				continue;
			}
			Patient patient = new Patient(name,age,illness);
			System.out.println("Patient Stored!");
			patients.add(patient);
		}else {
			if(choice==2) {
				System.out.println("__View All Patients Selected__");
				for(Patient p : patients) {
					p.displayInfo();
				}
			}else {
				if(choice==3) {
					boolean found = false;
					System.out.println(" __Search For Patient Selected__ ");
					System.out.print("Enter Patient id: ");
					int searchId=patientss.nextInt();
					for(Patient p : patients) {
						if(p.getPatientId()==searchId) {
							p.displayInfo();
							found=true;
						}
						if(!found) {
							System.out.println("Patient not Found");
						}
					}
				}else {
					if(choice==4) {
						System.out.println("__Remove Patient Selected__");
						System.out.print("Enter Patient id to Remove : ");
						int removeId = patientss.nextInt();
						boolean found = false;
						Iterator<Patient> iterator = patients.iterator();
						while(iterator.hasNext()) {
							Patient p = iterator.next();
							if(p.getPatientId()==removeId) {
								iterator.remove();
								found = true;
								System.out.println("Patient removed");
							}
						}
						if(!found) {
							System.out.println("Patient id is not found.");
						}
					}else {
						if(choice==5) {
							System.out.println("__Update Patient Selected__");
							System.out.print("Enter Patient id Update: ");
							int updateId = update.nextInt();
							patientss.nextLine();
							boolean found = false;
							for(Patient p : patients) {
								if(p.getPatientId()==updateId) {
									found=true;
									System.out.print("Enter New Age: ");
									int newAge = patientss.nextInt();
									patientss.nextLine();
									if(newAge<0 || newAge>120) {
										System.out.println("Invalid Age");
										continue;
									}
									p.setAge(newAge);
									System.out.println("Age Updated Successfully");
									System.out.print("New Illness: ");
									String newIllness = patientss.nextLine();
									if(newIllness.isEmpty()) {
										System.out.println("Invalid Illness");
										continue;
									}
									p.setIllness(newIllness);
									System.out.println("Patient Updated!");
								}
							}
						}else {
						if(choice==6) {
							System.out.println("__Exit Selected__");
							System.out.println("Total Patients: "+ patients.size());
							break;
						}
					}
				}
			}
		}
		}
		System.out.println("Total Patients: "+ patients.size());
		
		
		
		
		
		
		
		
		
		
		
		

		}
		patientss.close();
	}
}


