package Exception_handling;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Hello");
	}

}
