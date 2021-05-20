package javaCollectionFramework;

import java.util.LinkedHashMap;

class Students {
	String name;
	int number;
	char grade;
	double total;

	public Students(String name, int number, char grade, double total) {
		this.name = name;
		this.number = number;
		this.grade = grade;
		this.total = total;
	}

}

public class StudentsUsingMapIteratin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students("ram", 123, 'A', 55.0);
		Students s2 = new Students("sam", 233, 'B', 65.0);
		Students s3 = new Students("jam", 133, 'C', 75.0);
		Students s4 = new Students("mam", 342, 'A', 55.0);
		LinkedHashMap<Integer, Students> lhm = new LinkedHashMap<Integer, Students>();
		lhm.put(100, s1);
		lhm.put(101, s2);
		lhm.put(102, s3);
		lhm.put(103, s4);
		for(Integer key:lhm.keySet()){
			System.out.println(key);
		}
		for(Students value:lhm.values()){
			System.out.println("name "+value.name+" number "+value.number+" grade "+value.grade+" total "+value.total);
		}
	}

}
