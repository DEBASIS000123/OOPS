package Q5;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input no of studens :");
		int a=sc.nextInt();
		student s[]=new student[a];
		System.out.println("Enter Name,Roll,Mark :");
		for(int i=0;i<s.length;i++) {
			String n=sc.next();
			int r=sc.nextInt();
			Double m=sc.nextDouble();
			s[i]=new student(n,r,m);
		}
		System.out.println();
		double max=Double.MIN_VALUE;
		String nm="";
		for(int i=0;i<s.length;i++) {
			if(s[i].mark>max) {
				max=s[i].mark;
				nm=s[i].name;
			}
		}
		System.out.println("Topper is:"+nm+" and mark:"+max);
		System.out.println();
		System.out.println("Failed students are:");
		for(int i=0;i<s.length;i++) {
			if(s[i].mark<30) {
				System.out.println("Name ="+s[i].name+" Roll="+s[i].roll+" Mark="+s[i].mark);
				
			}
		}
		System.out.println();
		System.out.println("Students are in increasing order according to their marks :");
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-1-i;j++) {
				if(s[j].mark<s[j+1].mark) {
					student temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].name+" "+s[i].mark);
		}
	}

}
