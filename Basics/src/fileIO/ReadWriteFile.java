package fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("C://Users//ELCOT//OneDrive//Desktop//html learning//javaAsciiIo.txt");
			FileWriter fw=new FileWriter("C://Users//ELCOT//OneDrive//Desktop//html learning//ReadWriteIo.txt");
			String s="";
			int i;
			while((i=fr.read())!=-1){
				s=s+(char)i;
			}
			fr.close();
			fw.write(s);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
