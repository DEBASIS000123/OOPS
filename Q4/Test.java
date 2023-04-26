package Q4;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int n=sc.nextInt();
		student s[]=new student[n];
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter name , Roll no , mark1 , mark2 , mark3");
			String name=sc.next();
			int roll=sc.nextInt();
			double mark=sc.nextDouble();
			double mark2=sc.nextDouble();
			double mark3=sc.nextDouble();
			s[i]=new student(name,roll,mark,mark2,mark3);
					
		}
		System.out.println("Student Details:");
		for(int i=0;i<s.length;i++) {
			s[i].display();
		}
		System.out.println("Failed Students are:");
		for(int i=1;i<s.length;i++) {
			if(s[i].totalmark<90) {
				System.out.println(s[i].name+"   "+s[i].roll+"   "+s[i].totalmark);
			}
		}
		System.out.println("mark of students in decreasing order :");
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-i-1;j++) {
				if(s[j].totalmark<s[j+1].totalmark) {
					student temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].name+" "+s[i].roll+"  "+s[i].totalmark);
		}
	}

}
