package Inner_Class;
class outer2{
	static private int x=45;
	static class inner2{
		static void show2() {
			System.out.println("x="+x);
		}
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer2.inner2.show2();
		
	}

}
