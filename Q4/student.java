package Q4;

public class student {
	String name;
	int roll;
	double mark1;
	double mark2;
	double mark3;
	double totalmark;
	
	student(String name,int roll,double mark1,double mark2,double mark3) {
		this.name=name;
		this.roll=roll;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		totalmark=mark1+mark2+mark3;
	}
	void display() {
		System.out.println("Name ="+name+", Roll="+roll+", mark1="+mark1+", mark2="+mark2+", mark3="+mark3);
	}
	
}
