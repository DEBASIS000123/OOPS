package Exception_handling;
import java.io.FileInputStream;
import java.io.IOException;
public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fi=null;
		try {
		fi=new FileInputStream("d:/abc.text");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("File not found.");
		}
		finally {
			if(fi !=null) {
				try {
					fi.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("File closed.");
		}
	}

}
