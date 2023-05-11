package Exception_handling;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			System.out.println(ae.getMessage());
		}
		System.out.println("Hello");
	}

}
