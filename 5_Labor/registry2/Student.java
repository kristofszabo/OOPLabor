package registry2;

public class Student extends Person { 
	private double average;
	private int credits;
	public Student(String na, String ne, int y) {
		super(na, ne, y);
		average = 0.0; credits = 0;
	}
	public void addMark(int mark, int credit) {
		average = (average*credits + mark*credit) /
				(credits+credit);
		credits += credit;
	}
	public String toString() {
		return super.toString() +", "+average+", "+credits;
	}
	public String greetings() {
	    return "Hell�!";
	  }
	public void whatever() {
		this.yob = 2000;
		this.credits = 30;
	}
}  


