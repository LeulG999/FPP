package HashHomeWork.problem1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key,Student> studentMap = new HashMap<>();
		if(students==null)return studentMap;
		for(Student s:students){
			if(s==null){
				continue;
			}
			Key k=new Key(s.getFirstName(),s.getLastName());
			studentMap.put(k,s);
		}
		return studentMap;
	}
}
