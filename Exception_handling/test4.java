package Exception_handling;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100;
			int b=0;
			int c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Cannt divide bt zero");
		}
		System.out.println("hello");
	}

}
