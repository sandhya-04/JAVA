package java_hash_practice;
import java.util.*;
import java.io.*;
import java_hash_practice.ageComparator;
public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<student> st = new ArrayList<student>();
		st.add(new student(12,"sandhya",24));
		st.add(new student(13,"himanshu",22));
		st.add(new student(14,"anjali",21));
		st.add(new student(15,"kirti",21));
		
		System.out.println("Sorting by age");
		
		
		Collections.sort(st,new ageComparator()); 
		
      for(student al: st){  
    	  System.out.println(al.roll_no+" "+al.name+" "+al.age);  
      }  
      
      System.out.println("Sorting by name");
      
      Collections.sort(st , new NameComparator());
      
      for(student al:st) {
    	  System.out.println(al.age+" "+al.name+" "+al.roll_no);
      }
      
      
      
	}

}
