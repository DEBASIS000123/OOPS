package Exception_handling;
import java.io.FileInputStream;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("d:/abc.text");
		}
		catch(Exception Ex) {
			System.out.println(Ex);
		}
		System.out.println("Hello");
	}

}
