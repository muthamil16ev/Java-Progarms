package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class AsciiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("C://Users//ELCOT//OneDrive//Desktop//html learning//javaAsciiIo.txt");
			for(int i=1;i<=127;i++){
				fw.write(i+"---->"+(char)(i)+"\n");
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
System.out.println(e);
		}
	}

}
