package Single_inheritance;

public class person {
	String name;
	int age;
	private char gender;
	void setperson(String name,int age,char g) {
		this.name=name;
		this.age=age;
		age=g;
	}
	void showperson() {
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Gender="+gender);
	}

}
