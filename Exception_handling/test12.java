package Exception_handling;
import java.util.Scanner;
class YoungerAgeExceptionn extends Exception{
	YoungerAgeExceptionn(String msg){
		super(msg);
	}
}
public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new YoungerAgeExceptionn("You are not elligible for vote.");
			}
			else {
				System.out.println("You can vote sucssfully.");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello");
	}

}
