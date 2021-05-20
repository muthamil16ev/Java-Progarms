package javaCollectionFramework;

import java.util.ArrayList;

class Employee{
	int empId;
	String empName;
	double salary;
	char empGrade;
	public Employee(int empId, String empName, double salary, char empGrade) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.empGrade = empGrade;
	}
	
}
class Student{
	int rollNo;
	String stuName;
	double total;
	char stuGrade;
	public Student(int rollNo, String stuName, double total, char stuGrade) {
		this.rollNo = rollNo;
		this.stuName = stuName;
		this.total = total;
		this.stuGrade = stuGrade;
	}
	
}
public class UserType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(123,"muthu",78.0,'D');
Student s2=new Student(124,"jam",92.0,'C');
Student s3=new Student(132,"sam",83.0,'E');
Student s4=new Student(186,"zara",65.2,'A');
Student s5=new Student(176,"azar",79.0,'B');
Employee e1=new Employee(321,"tamil",10000.0,'C');
ArrayList al=new ArrayList();//Adding user defined type to container
al.add(s1);//adding object of student class
al.add(s2);
al.add(s3);
al.add(s4);
al.add(s5);
//al.add(e1);//adding object of student class
for(int i=0;i<al.size();i++){
Student s=(Student)al.get(i);// retrieval student
System.out.println(s.rollNo+" "+s.stuName+" "+s.total+" "+s.stuGrade);
}
/*Employee e=(Employee)al.get(1);// retrieval student
System.out.println(e.empId+" "+e.empName+" "+e.salary+" "+e.empGrade);*/

	}

}
