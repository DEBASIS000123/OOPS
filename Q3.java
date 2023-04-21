import java.util.Scanner;
class student1{
	String name;
	int roll;
	double mark;
	student1(String name ,int roll,double mark){
		this.name=name;
		this.roll=roll;
		this.mark=mark;
	}
	void display () {
		System.out.println("Name ="+name+", Roll ="+roll+", Mark="+mark);
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int a=sc.nextInt();
		student1[] s=new student1 [a];
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter student name :");
			String n=sc.next();
			System.out.println("Enter "+n+"\'s"+" roll no");
			int r=sc.nextInt();
			System.out.println("Enter "+n+"\'s"+" the mark");
			double m=sc.nextDouble();
			s[i]=new student1(n,r,m);
		}
		System.out.println("Student detils :");
		for(int i=0;i<s.length;i++) {
			s[i].display();
		}
	}

}
