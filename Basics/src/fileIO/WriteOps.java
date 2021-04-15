package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("C://Users//ELCOT//OneDrive//Desktop//html learning//javaIo.txt",true);
			String s = " Tamil\tis\nold\tlanguage.";
			fw.write(s);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			//System.out.println(e);
			e.printStackTrace();
		}
	}

}
