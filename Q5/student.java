package Q5;
class student{
	String name;
	int roll;
	double mark;
	student(String name,int roll,double mark){
		this.name=name;
		this.roll=roll;
		this.mark=mark;
	}
	void display() {
		System.out.println("Name="+name+" Roll="+roll+" Mark="+mark);
	}
}
