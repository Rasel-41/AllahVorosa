public class Executive extends Manager{
    public Executive(String name,double salary,String department){
        super(name, salary, department);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String getDepartment() {
        return super.getDepartment();
    }
    public String toString(){
        return "Executive name: "+getName()+",Salary : "+getSalary()+",Department :"+getDepartment();
    }
}
