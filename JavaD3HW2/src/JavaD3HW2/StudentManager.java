package JavaD3HW2;

public class StudentManager extends UserManager{
	
	public void add(Student student) {
		System.out.println("Sevgili öðrenci "+ student.getFirstName()+ " " + student.getLastName() + ", " + student.getStudentNumber() + " öðrenci numaranýz sisteme kaydýnýz gerçekleþti." );
		System.out.println("----------------");
	}

}
