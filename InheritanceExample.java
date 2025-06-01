class Animal{
    public Animal(){
        System.out.println("Animal constructor");
    }
    public Animal(int age){
        System.out.println("Animal constructor: "+age);
    }
    //parent class or super class
    public void eat(){
        System.out.println("Animal eats");
    }
    public void walk(){
        System.out.println("Animal might walk");
    }
}
class Human extends Animal{
    //child class or subclass
    public void walk(){
        //super keyword is used to call parent class
        super.walk();
        System.out.println("Human walks");
    }
}public class InheritanceExample {
    public static void main(String[] args){
    Human human1= new Human();
    human1.eat();
    human1.walk();
    }
}
