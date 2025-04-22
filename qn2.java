import java.util.Scanner;
public class qn2 {
    public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 1st number:");
    int a=sc.nextInt();
    System.out.print("Enter 2nd number:");
    int b=sc.nextInt();
    int sum=a+b;
    int diff=a-b;
    int product=a*b;
    int quotient=a/b;
    System.out.println("sum:" +sum);
    System.out.println("Difference:" +diff);
    System.out.println("product:" +product);
    System.out.println("quotient:" +quotient);


}
}