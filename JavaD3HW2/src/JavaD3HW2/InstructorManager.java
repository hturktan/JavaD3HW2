package JavaD3HW2;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println("Sayýn eðitmenim " + instructor.getFirstName() + " " + instructor.getLastName() + ", " + instructor.getInstructorNumber() + " eðitmen numaranýz ile veritabanýna kaydýnýz gerçekleþti." );
		System.out.println("----------------");
	}
}
