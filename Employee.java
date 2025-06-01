public class Employee{
    private String name;
    private Double Salary;
    private String position;
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(Double salary){
        this.salary=salary;

    }
    public void setPosition(String position){
        this.position=position;
    }
    public String getName(){
        return name;
    }
    public Double getSalary(){
        return salary;
    }
    public String getPosition(){
        return position;
    }
    
}
class Driverclass{
public static void main(String[] args){
    Employee employee= new Employee();
    employee.setName("rojisha");
        System.out.println(employee.getName());
        employee.setSalary("25000");
        System.out.println(employee.getSalary());
    employee.setPosition("Manager");
        System.out.println(employee.getPosition());



}
}