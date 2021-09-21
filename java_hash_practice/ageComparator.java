package java_hash_practice;
import java.util.*;  
class ageComparator implements Comparator<student>{  
public int compare(student s1,student s2){  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  
