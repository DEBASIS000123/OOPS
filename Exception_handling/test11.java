package Exception_handling;
import java.util.Scanner;
class YoungerAgeException extends Exception{
	YoungerAgeException(String msg){
		super(msg);
	}
}
public class test11 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter your age :");
		int a=sc.nextInt();
		if(a<18) {
		//	throw new YoungerAgeException("You are not elligible for vote.");//(it will show error );
		}
		else {
			System.out.println("You can vote sucessfully.");
		}
	}

}
