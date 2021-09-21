package java_hash_practice;
import java.util.*;
 class NameComparator implements Comparator<student> {
       public int compare(student s1,student s2) {
    	   return s1.name.compareTo(s2.name);
       }
	
}
