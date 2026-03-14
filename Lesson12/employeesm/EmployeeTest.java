package employeesm;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("Renuka", "Mohanraj", "123-251-22", 5500);
        employees[1] = new HourlyEmployee("Leul", "Tsige", "122-321-11", 500, 40);
        employees[2] = new CommissionEmployee("Jerusalem", "Kenea", "221-31-21", 500, 230);
        employees[3] = new BasePlusCommissionEmployee("Abebe", "Chals", "987-654-22", 2500, 250, 200);
      Employee[] filtered=findSalaryList(employees,60000);
      for(Employee filter:filtered){
          System.out.println(filter);
      }
    }
    public static Employee[] findSalaryList(Employee[] employees, double salary) {
   if(employees==null)return new Employee[0];
        int count=0;
        for (Employee emp : employees) {
            if(emp!=null && emp.getPayment()<salary){
                count++;
            }
        }
        int count2=0;
        Employee[]employees1=new Employee[count];
        for(int i=0;i< employees.length;i++){
            if(employees[i]!=null && employees[i].getPayment()<salary){
                employees1[count2++]=employees[i];
            }
        }
        return employees1;
    }
}