public class Manager extends Employee{
    private String department;
    public Manager(String name,double salary,String department){
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
    public String toString(){
        return "Manager name: "+getName()+",Salary: "+getSalary()+",Department: "+getDepartment();
    }
}
