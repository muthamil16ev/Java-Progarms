package multiThreading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class X extends Thread{
	synchronized public void run(){
		try {
			FileReader fr = new FileReader("C://Users//ELCOT//OneDrive//Desktop//html learning//abc.txt");
		int i;
			while((i=fr.read())!=-1){
				System.out.println((char)i);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Y extends Thread{
	synchronized public void run(){
	try {
		sleep(1000);
		FileWriter fw = new FileWriter("C://Users//ELCOT//OneDrive//Desktop//html learning//abc.txt");
	fw.write("pyhton");
	fw.flush();
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
}
public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x=new X();
		Y y=new Y();
		x.start();
		y.start();
	}

}
