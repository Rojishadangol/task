public class ConstructorsJava {
     int a;
     
    //default constructor
    ConstructorsJava(){}
        //parameterized constructor
        ConstructorsJava(int a){
            System.out.println(a+ " was passed");
            this.a=a;
        }
        //another constructor
        ConstructorsJava(int a,int b){
            System.out.println(a+"and" +b+" were passed");
            int sum=a+b;
            this.a=sum;
        }
        //copy constructor
        ConstructorsJava(ConstructorsJava cons){
            System.out.println("COPY CONSTRUCTOR");
            this.a=cons.a;
        }
              
    
}

class UsingConstructor{
    public static void main(String[] args){
        ConstructorsJava obj1=new ConstructorsJava();
                ConstructorsJava obj2=new ConstructorsJava(10);
                        ConstructorsJava obj3=new ConstructorsJava(1,2);
                                ConstructorsJava obj4=new ConstructorsJava(obj2);



    }
}
