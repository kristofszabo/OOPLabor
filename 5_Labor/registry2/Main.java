package registry2;

import java.util.ArrayList;

public class Main {
	static public void main(String[] args) {
		
		// 1. példa, Person
		Student s1 = new Student("Gipsz Jakab", "1A2B3C", 1996);
		Teacher t1 = new Teacher("Rend Elek", "Q1W2E3", 1973);
		//Person  p1 = new Person("Nagy Károly", "XXX111", 1998);

		Person p2 = s1;
		Person p3 = t1;

		System.out.println(s1); //Gipsz Jakab (1A2B3C), 1996, 0.0, 0
		System.out.println(t1); //Rend Elek (Q1W2E3), 1973, assis...
		//System.out.println(p1); //Nagy Károly (XXX111), 1998
		System.out.println(p2); //Gipsz Jakab (1A2B3C), 1996, 0.0, 0
		System.out.println(p3); //Rend Elek (Q1W2E3), 1973, assis...

		// 2. példa, kivételek
		Course c = new Course("Zabhegyezés", "BMEVIIIZZ00", 2);
		Teacher t = new Teacher("Vastagh Béla", "VSTGBL", 1975);
		c.setTeacher(t);
		try {
		  c.addStudent(new Student("Lutz Ernő", "LTZRN0",1996));
		  c.addStudent(new Student("Szőke Barna", "BRN123",1996));
		  //c.addStudent(new Student("Hervadt Virág", "HRVDTV",1995));
		  c.removeByNeptun("BRN123");
		  //c.removeByNeptun("BRN123");
		} catch (CourseFullException e) {
		  System.err.println("Tele van a kurzus!");
		} catch (NeptunNotFoundException e) {
		  System.err.println("Nincs ilyen neptunkód!");
		}

		// Feladatok
		/* ArrayList<Artist> artists = new ArrayList<>();
		artists.add(new Artist("Van Darkholme", "G4CH1B", 1976, "Performance Artists"));
		artists.add(new Artist("Just Vidman", "V1DM4N", 2013, "Entertainer"));
		artists.add(new Artist("Meghoztuk a... Tudod... Hmmmmmmm", "HMMMMM", 1988, "Music"));

		System.out.println(artists.get(0));
		System.out.println(artists.get(1).meet(artists.get(2)));
		System.out.println(t1.meet(s1)); */

		Singer as1 = new Singer("Break Elek", "BREAK1", 1996);
		Painter ap1 = new Painter("Füty Imre", "HAHA69", 1969);
		Writer aw1 = new Writer("Dil Emma", "DILEMA", 1997);
		Drummer d1 = new Drummer("Reset Elek", "RESET0", 1999);

		System.out.println(as1);
		System.out.println(ap1);
		System.out.println(aw1);
		System.out.println(d1);
	}
}
