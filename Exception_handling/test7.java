package Exception_handling;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.toString());
		}
	}

}
