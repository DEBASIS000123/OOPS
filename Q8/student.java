package Q8;
import java.util.Scanner;
public class student {
	Scanner sc=new Scanner(System.in);
	private String name;
	private double mark;
	private static String collegename="ITER";
	void setdata() {
		System.out.println("Enter the name :");
		name=sc.next();
		System.out.println("Enter the mark :");
		mark=sc.nextDouble();
	}
	void showdata() {
		System.out.println("Name="+name+", Mark="+mark+", College name="+collegename);
	}
	
	
}
