import java.util.*;

abstract class Student{
	String name;
	int marks;
	private void printInfo(String name, int marks){
		System.out.println("Name is:"+ name +"Marks are:"+ marks);
	}
	public Student(String[] name, int marks){
		this.name=name;
		this.marks=marks;
	}
}

public class StuColl{
	
public static void main(String[] args){	
Student Student1 = new Student(Shoku, 78);
Student Student2 = new Student(Mota, 45);
Student Student3 = new Student(Chetan, 92);

List <Student> coll = new ArrayList<Student>();

coll.add("Student1");
coll.add("Student2");
coll.add("Student3");

Iterator itr = List.iterator();
while(itr.hasNext()){
	
}
}
}