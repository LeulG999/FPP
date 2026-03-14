package employeesm;
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double baseSalary,double grossSales,double commissionRate){
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);

        this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString(){
        return super.toString()+"\nBase Salary: "+getBaseSalary();
    }
    @Override
    public double getPayment() {
        return getBaseSalary()+super.getPayment();
    }
}
