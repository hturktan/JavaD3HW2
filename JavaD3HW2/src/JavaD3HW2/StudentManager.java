package JavaD3HW2;

public class StudentManager extends UserManager{
	
	public void add(Student student) {
		System.out.println("Sevgili ��renci "+ student.getFirstName()+ " " + student.getLastName() + ", " + student.getStudentNumber() + " ��renci numaran�z sisteme kayd�n�z ger�ekle�ti." );
		System.out.println("----------------");
	}

}
