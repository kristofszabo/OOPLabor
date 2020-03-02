package registry;

public class Course {
	private String name; 
	private String neptun;
	private Student students[];
	private Teacher teacher;

	public Course(String na, String ne, int sn) {
		name = na; neptun = ne;
		students = new Student[sn]; // no Student is created!!!
	}

	public String getName() { return name; }
	public String getNeptun() { return neptun; }
	public void setTeacher(Teacher t) { teacher = t; }
	public void addStudent(Student s)  throws Exception{
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getNeptun().equals(s.getNeptun())) {
				throw new Exception("A kurzust már felvette!");
			}
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = s;
				return;
			}
		}
		throw new Exception("A kurzus megtelt, sikertelent tárgyfelvétel!");
	}

	public void listStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println(students[i]);
			}
		}
	}
	public void removeByNeptun(String neptun) throws Exception {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getNeptun().equals(neptun)) {
				students[i] = null;
				return;
			}
		}
		throw new Exception("A megadott neptun kóddal nem szerepel senki a kurzusban!");
	}
	@Override
	public String toString() {
		return name+" ("+neptun+")";
	}

}  
