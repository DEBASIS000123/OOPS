package Hierachial_inheritance;

public class C extends B {
	int c;
	C(int a,int b,int c){
		super(a,b);
		this.c=c;
	}
	void showc() {
		System.out.println(c);
		System.out.println(a+" "+b+" "+c);
	}
}
