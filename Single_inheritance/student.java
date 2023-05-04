package Single_inheritance;

public class student extends person {
	int roll;
	double mark;
	void setstudent(int roll,double mark) {
		this.roll=roll;
		this.mark=mark;
	}
	void showstudent() {
		System.out.println("Roll no="+roll);
		System.out.println("Mark="+mark);
	}
}
