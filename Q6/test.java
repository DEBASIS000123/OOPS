package Q6;
import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		student s1=new student();
		student s2=new student();
		System.out.println("Enter name and Roll no :");
		String n1=sc.next();
		int r1=sc.nextInt();
		s1.setdata(n1, r1);
		System.out.println("Enter name and Roll no :");
		String n2=sc.next();
		int r2=sc.nextInt();
		s2.setdata(n2, r2);
		s1.display();
		System.out.println();
		s2.display();
		
		}

}
