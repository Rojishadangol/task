import java.util.Scanner;

public class qn3 {
        public static void main (String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number:");
            int a=sc.nextInt();
            
            if (a>0){
                 
                 System.out.println(a+ "is the positive number");
                }
            else if (a==0){
               
               System.out.println(a+ "is thezero");
               }
                            
            else{
            System.out.println(a+ "is the negative number");
            }      
    
        }      
    }
    