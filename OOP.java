public class OOP{
    String name;
    int age;
    int studentId;
    public void printDetails(){
        System.out.println(name+age+studentId);
    }
}
class Implementation{
    public static void main(String[] args){
        OOP student1= new OOP();
        student1.name="Max";
        student1.age=20;
        student1.studentId=200009;
        student1.printDetails();
    }
}

