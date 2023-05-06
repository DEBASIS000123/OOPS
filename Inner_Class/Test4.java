package Inner_Class;
class outer3{
	private int s=88;
	class inner3{
		void show() {
			System.out.println("s="+s);
		}
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer3 ob1=new outer3();
		outer3.inner3 ob2=ob1.new inner3(); 
		ob2.show();
	}

}
