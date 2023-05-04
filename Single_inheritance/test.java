package Single_inheritance;

public class test {

	public static void main(String[] args) {
		student s1=new student();
		student s2=new student();
		s1.setperson("kunu",19,'M');
		s1.setstudent(10,99);
		s2.setperson("Munu",20,'M');
		s2.setstudent(11,98);
		s1.showperson();
		s1.showstudent();
		System.out.println();
		s2.showperson();
		s2.showstudent();
	}

}
