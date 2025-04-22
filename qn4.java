import java.util.Scanner;

public class qn4 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        if (a%5==0 && a%11==0){
             
            System.out.println(a + "is divisible by both");
           }
      
                       
       else{
       System.out.println(a+ "is the not a divisible number");
       }

    
}
}