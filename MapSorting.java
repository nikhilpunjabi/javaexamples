//Sorting Custom Objects(Student) Based on Marks stored in Map. 
import java.util.*;
class Student{
	String name;
	int marks;
	public Student(String name,int marks){
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString(){
		return name + " " + marks + "\n" ;
	}
}
class MapSorting{
	public static void main(String args[]){
		Map<Integer,Student> m = new HashMap<>();
		m.put(1,new Student("Sahil",54));
		m.put(2,new Student("Akash",64));
		m.put(3,new Student("Nikhil",40));
		m.put(4,new Student("Harsh",90));
		m.put(5,new Student("Rohit",50));
		System.out.println(m);
		Set<Map.Entry<Integer,Student>> s = m.entrySet();
		List<Map.Entry<Integer,Student>> lst = new ArrayList<>(s);
		Collections.sort(lst,(a,b)->{return a.getValue().marks > b.getValue().marks ?  -1 : 1;});
		System.out.println(lst);	
	}
}