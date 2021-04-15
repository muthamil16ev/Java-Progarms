package fileIO;

import java.io.FileReader;
import java.io.IOException;

public class CountsIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCount=0;
		int wordsCount=1;
		int sentenceCount=1;
		int linesCount=1;
try{
	FileReader fr=new FileReader("C://Users//ELCOT//OneDrive//Desktop//html learning//ReadCount.txt");
	int i;
	while((i=fr.read())!=-1){
		charCount+=1;
		if((char)i==' '){
			wordsCount+=1;
		}
		if((char)i=='.'){
			sentenceCount+=1;
		}
		if((char)i=='\n'){
			linesCount+=1;
		}
	}
}catch(IOException e){
	System.out.println(e);
}
System.out.println("No of character : "+charCount);
System.out.println("No of words : "+wordsCount);
System.out.println("No of sentence : "+sentenceCount);
System.out.println("No of lines : "+linesCount);
System.out.println("No of space : "+(wordsCount-1));
	}
	

}
