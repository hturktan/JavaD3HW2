package JavaD3HW2;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println("Say�n e�itmenim " + instructor.getFirstName() + " " + instructor.getLastName() + ", " + instructor.getInstructorNumber() + " e�itmen numaran�z ile veritaban�na kayd�n�z ger�ekle�ti." );
		System.out.println("----------------");
	}
}
