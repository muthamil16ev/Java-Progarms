package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class TenFileSameLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]={"javaIo1","javaIo2","javaIo3","javaIo4","javaIo5","javaIo6","javaIo7","javaIo8","javaIo9","javaIo10"};
		String ss[]={"Tamil is one of the oldest language in world","india is seventh richest country in the world","india is biggest democracy country","the loving touch",
				"java is general purpose programming language","java is platform independent","java is object oriented","java is invented by james gosling","jjava is open source","java is simple"};
		for(int i=0;i<=10;i++){
		try {
			FileWriter fw = new FileWriter("C://Users//ELCOT//OneDrive//Desktop//html learning//"
					+ s[i]+".txt");
				fw.write(ss[i]);
			fw.flush();
			fw.close();
		} catch (IOException e) {
System.out.println(e);
		}}
	}

}
