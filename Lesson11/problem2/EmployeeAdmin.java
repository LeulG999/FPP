package HashHomeWork.problem2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		if(table==null || socSecNums==null)return null;
		ArrayList<Employee> emp=new ArrayList<>();
		for(String s:socSecNums){
			if(table.containsKey(s) && table.get(s).getSalary()>80000){
				emp.add(table.get(s));
			}
		}
		Collections.sort(emp,Comparator.comparing(Employee::getSsn));
		return emp;
	}
	
}
