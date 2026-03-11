package homework.prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		if(aList==null)return 0.0;
		double sum=0;
		for(int i=0;i<aList.size();i++){
			if(aList.get(i)==null){
				continue;
			}
			double eachValue=aList.get(i).getSalary();
			sum+=eachValue;
		}

		return sum;
	}
}
