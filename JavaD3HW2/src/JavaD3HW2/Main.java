package JavaD3HW2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(101);
		student1.setFirstName("Ali");
		student1.setLastName("Can");
		student1.setEmail("ali@can.com");
		student1.setPassword("alican");
		student1.setStudentNumber("123");
		
		UserManager usermanager1 = new UserManager();
		usermanager1.add(student1);
		
		StudentManager studentManager1 = new StudentManager();
		studentManager1.add(student1);
		
		Student student2 = new Student();
		student2.setId(102);
		student2.setFirstName("Hasan");
		student2.setLastName("Ali");
		student2.setEmail("hasan@ali.com");
		student2.setPassword("hasanali");
		student2.setStudentNumber("124");
		
		UserManager userManager2 = new UserManager();
		userManager2.add(student2);
		
		StudentManager studentManager2 = new StudentManager();
		studentManager2.add(student2);
				
		Instructor instructor1 = new Instructor();
		instructor1.setId(1001);
		instructor1.setFirstName("Ahmet");
		instructor1.setLastName("Mehmet");
		instructor1.setEmail("ahmet@mehmet.com");
		instructor1.setPassword("ahmetmehmet");
		instructor1.setInstructorNumber("1001");
	
		UserManager usermanager3 = new UserManager();
		usermanager3.add(instructor1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
	}
		
}
