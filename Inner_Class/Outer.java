package Inner_Class;

public class Outer {
	int x=3;
	class inner{
		void show() {
			System.out.println("x="+x);
		}
	}
	void display() {
		inner ob=new inner();
		ob.show();
	}
}
