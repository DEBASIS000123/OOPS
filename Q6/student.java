package Q6;

public class student {
	String name;
	int roll;
	static String collegename="ITER";
	
	void setdata(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	void display() {
		System.out.println("Name ="+name+", Roll="+roll+", College name="+collegename);
	}
}


