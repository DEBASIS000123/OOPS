package Q7;
import java.util.Scanner;
public class student {
	Scanner sc=new Scanner(System.in);
	private String student;
	private double mark;
	static String collegename="ITER";
	void setdata() {
		System.out.println("Enter the name :");
		student=sc.next();
		System.out.println("Enet the mark :");
		mark=sc.nextDouble();
	}
	 void showdata() {
		System.out.println("Name ="+student+" Mark= "+mark+" College name="+collegename);
	}
	

}
