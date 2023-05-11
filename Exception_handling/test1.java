package Exception_handling;
import java.io.FileInputStream;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fi=new FileInputStream("d:/abc.text");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
