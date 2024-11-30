public class test {
    public static void main(String[] args) {
        Employee employee = new Employee("Jassi",50000);
        Manager manager = new Manager("Tasnim",60000,"Math");
        Executive executive = new Executive("Sristy",70000,"Law");
        System.out.println(employee);
        System.out.println(manager);
        System.out.println(executive);
    }
}
