import java.util.Scanner;
class student{
	String name;
	int roll;
	double mark;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input name ,roll , mark");
			name=sc.nextLine();
			roll=sc.nextInt();
			mark=sc.nextDouble();
	}
	void display() {
		System.out.println("Name= "+name);
		System.out.println("Roll= "+roll);
		System.out.println("Mark= "+mark);
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		student s2=new student();
		s1.input();
		s2.input();
		s1.display();
		s2.display();
	}

}
