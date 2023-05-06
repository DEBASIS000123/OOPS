package Inner_Class;
class outer1{
	static private int n=99;
	static class inner1{
		void show() {
			System.out.println("n="+n);
		}
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer1.inner1 ob=new outer1.inner1();
		ob.show();
	}

}
