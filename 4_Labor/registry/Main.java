package registry;

public class Main {
	static public void main(String[] args) {
		// 1. pelda
		Student s1 = new Student("Gipsz Jakab", "1A2B3C", 1996);
		Student s2 = new Student("Nagy Károly", "XXX111", 1998);
		Student s3 = new Student("Kis Pippin", "111XXX", 1999);

		s1.addMark(4, 2);

		Teacher t1 = new Teacher("Rend Elek", "Q1W2E3", 1973);
		Teacher t2 = new Teacher("Csirke Béla", "OKTAT6", 1980);

		System.out.println(s1); 
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(t1); 
		System.out.println(t2);

		// 2. pelda 
		Course c = new Course("Zártkörű Kevésfős Zabhegyezés", "BMEVIIIZZ00", 6);
		Teacher t = new Teacher("Vastagh Béla", "VSTGBL", 1975);
		c.setTeacher(t);

		try {
			c.addStudent(new Student("Lutz Ernő", "LTZRN0", 1997));
			c.addStudent(new Student("Szőke Barna", "BRN123", 1997));
			c.addStudent(new Student("Hervadt Virág", "HRVDTV", 1998));
			c.addStudent(new Student("Brék Elek", "BREAK1", 1996));
			c.addStudent(new Student("Füty Imre", "J0V1CC", 1969));
			c.addStudent(new Student("Dil Emma", "D1L3M4", 1998));
			//c.addStudent(new Student("Reset Elek", "RESET0", 1998));
			//c.addStudent(new Student("Brék Elek", "BREAK1", 1996));

			c.listStudents();
			System.out.println();

			//c.removeByNeptun("NINCS0");
		} catch (Exception e) {
			e.printStackTrace();
		}

		c.listStudents();

	}
}
