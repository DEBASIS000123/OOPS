package Hierachial_inheritance;

public class B extends A{
	int b;
	B(int a,int b){
		super(a);
		this.b=b;
	}
	void showb() {
		System.out.println(b);
	}

}
