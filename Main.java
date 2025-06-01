// public class Main{
//     public static void main(String[] args){
//         System.out.println("Hello,World!");
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         System.out.println("This is my forst program \n I am on module STW4003CEM");
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         System.out.println("A \"quoted\" string is \'much\' better if you learn the rules of \'escape sequences\'");
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         System.out.println("*\n**\n***\n****\n*****");
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         System.out.println("*********\n*********\n*********\n*********\n*********");
//     }
// }


// public class Main {
//     public static void main (String[] args){
//         System.out.println("hello, world");
//     }
// }

// public class Main {
//     public static void main (String[] args){
//         System.out.println("this is my first program \n  i am on module STW4003CEM");
//     }
// }

// public class Main {
//     public static void main (String[] args){
//         System.out.println("A \"quoted\" string is\'much\' better if you learn the rules of \"escape sequences.\"");
//     }
// }
// public class Main {
//     public static void main (String[] args){
//         System.out.println("*\n**\n***\n***");
//     }
// }



// public class Main {
//     public static void main (String[] args){
//         System.out.println("*********\n*********\n*********");
//     }
// }

// public class Main {
//     public static void main (String[] args){
//         int age=20;
//         System.out.println(age>=18? "you are eligible to vote ": "you are not eligible to vote");
//     }
// }

// public class Main {
//     public static void main (String[] args){
//         int P=1200;
//         int T=2;
//         int R=10;
//         int SI=(P*T*R)/100;
//         System.out.println("simple intrest is" +SI);
//     }
// }

// public class Main {
//     public static void main (String[] args){
//         int L=22;
        
//         int Volume=L*L*L;
//         System.out.println("volume is" +Volume);
//     }
// }


// import java.util.Scanner;
// public class Main {
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter first number: ");
//         int b = sc.nextInt();
//         int sum = a+b;
//         int product = a*b;

//         System.out.println("sum" + sum);
//         System.out.println("product" + product);
//     }
// }

// import java.util.Scanner;
// public class Main {
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter first number: ");
//         int b = sc.nextInt();
//         int sum = a+b;
//         int product = a*b;
//         int div = sum/product;
//         System.out.println("sum" + sum);
//         System.out.println("product" + product);
//         System.out.println("div" + div);
//     }
// }

// import java.util.Scanner;
// public class Main {
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String a = sc.nextLine();
//         System.out.print("Enter your rollno: ");
//         int b = sc.nextInt();
//         System.out.print("Enter your field of your interest: ");
//         String c = sc.nextLine();

        
//         System.out.println("Hey, my name is "+ a+ " and my roll number is"+b+". My field of interest are" +c+"." );
       
//     }
// }  

// import java.util.Scanner;

// public class Main {
//         public static void main (String[] args){
//             int age=21;
//         if(age>=18){
//             System.out.println("You can vote ");
//         } else{
//             System.out.println("you cannot vote");
//         }
//         //if else elif
//         if (age>=21){
//             System.out.println("you are 21 or above");
//         }else if(age>=18){
//             System.out.println("you are 18 or over but not 21");

//         }else{
//             System.out.println("you are smaller than 18");
//         }      
//         //nested if
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the first number");
//         int a=sc.nextInt();
//         System.out.print("enter the second  number");
//         int b=sc.nextInt();
//         System.out.print("enter the third number");
//         int c=sc.nextInt();
//         String name=sc.nextLine();
//         sc.close();
//         if (a>b){
//             if (a>c){
//             System.out.println(a+"is the highest number");
//             }
//          }else{
//             if (b>c){
//                 System.out.println(b+"is the highest number");
//                 }
            
//         else{
//             System.out.println(c+"is the highest number");
//         }      

//         }
//     String day="Saturday";
//     switch(day){
//         case "sunday":
//              System.out.println("First day of the week");
//              break;
//         case "monday":
//              System.out.println("second day of the week");
//              break;
//         default:
//              System.out.println("some other day of the week");
//              break;
//     }
//     }  
// }



// public class Main {
//         public static void main (String[] args){
//             int a=12;
//             int b=23;
//             int c=45;
//             if (a>b){
//                  if (a>c){
//                  System.out.println(a+"is the highest number");
//                 }
//             }else{
//                if (b>c){
//                System.out.println(b+"is the highest number");
//                }
                            
//             else{
//             System.out.println(c+"is the highest number");
//             }      

//         }      
//     }
// }    

// public class Main {
//     public static void main (String[] args){
//         int a=12;
        
//         if (a>0){
             
//              System.out.println(a+ "is the positive number");
//             }
//         else if (a==0){
           
//            System.out.println(a+ "is thezero");
//            }
                        
//         else{
//         System.out.println(a+ "is the negative number");
//         }      

//     }      
// }


// public class Main {
//     public static void main (String[] args){
//         int a=55;
        
//         if (a%5==0 && a%11==0){
             
//              System.out.println(a + "is divisible by both");
//             }
       
                        
//         else{
//         System.out.println(a+ "is the not a divisible number");
//         }      

//     }      
// }

// public class Main {
//     public static void main (String[] args){
//         int a=55;
        
//         if (a%2==0 ){
             
//              System.out.println(a + " is even number");
//             }
       
                        
//         else{
//         System.out.println(a+ " is odd number");
//         }      

//     }      
// }

// public class Main {
//     public static void main (String[] args){
//         int year=2004;
        
//         if ( year%4==0 || year%100!=0 || year%400==0 ){
             
//              System.out.println(year + " is leap year");
//             }
       
                        
//         else{
//         System.out.println(year+ " is not a leap year");
//         }      

//     }      
// }


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

        
//         System.out.print("Enter an alphabet: ");
//         char ch = scanner.next().charAt(0);

        
//         ch = Character.toLowerCase(ch);

        
//         if ((ch >= 'a' && ch <= 'z')) {
            
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 System.out.println(ch + " is a vowel.");
//             } else {
//                 System.out.println(ch + " is a consonant.");
//             }
//         } else {
//             System.out.println("Invalid input! Please enter an alphabet letter.");
//         }

//         scanner.close();
// }
// }


// public class Main{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter the student's grade (A, B, C, D, or F): ");
//         String gradeInput = scanner.nextLine();
        
//         double gpa;

//         switch (gradeInput) {
//             case "A":
//                 gpa = 4.0;
//                 break;
//             case "B":
//                 gpa = 3.0;
//                 break;
//             case "C":
//                 gpa = 2.0;
//                 break;
//             case "D":
//                 gpa = 1.0;
//                 break;
//             case "F":
//                 gpa = 0.0;
//                 break;
//             default:
//                 System.out.println("Invalid grade entered.");
//                 return; 
//         }

//         System.out.println("The GPA value for grade " + gradeInput + " is " + gpa);
//     }
// }


// int i=5;
// int sum=6 + i++;
// System.out.println("SUM" + sum);
// int k =5;
// int sum1= 6+ ++k;
// System.out.println("SUM1" + sum1);

// String name = "my name";
// String name1= new String("my name");
// String name2= name+ name1;
// String name3=name.concat(name2);
// char val=name.charAt(1);
// System.out.println(name.length());
// String value=name.substring(1,4);
// System.out.println("Substring:"+ value);
// System.out.println(name.equals("myname"));
// System.out.println(name.equalsIgnoreCase("my name"));
// name.contains("Name");
// name.startsWith("my");
// name.endsWith("e");
// name.indexOf("n");
// name.toLowerCase();
// name.toUpperCase();
// String val1="Hello ".trim();
// name.replace('a','b');
// String stringToSplit="abc.def.ghi";
// String[] seq=stringToSplit.split(",");
// int number=1;
// String numString=String.valueOf(number);
//     }
// }




// class  ForLooop{
//     public static void main(String[] args) {
//         // for (int i=0;i<101;i++){
//         //     System.out.println(i);
//         // }
//         // for (int a=1; a<11;a++){
//         //     for(int b=0;a<=b;a++){
//         //         System.out.println(b);}
//         // }
//         //multipication table
//         for (int a=1 ;a<10;a++){
//             for(int b=1;b<=10;b++){
                // System.out.println(a+"x"+ b +"="+(a*b)+"\t");

//             }
//             System.out.println();
//         }
         
//     }
// }



// import java.util.scanner;
// class ForLooop{
//     public static void main(String[]args){
//         Scanner Scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         int sum = 0;
//         for (int a=1;a <= number; a++) {
            
//             sum += a;
//     }
//         System.out.println("the sum from 1 to"+ number + "is:" + sum);
//     }
// }


// import java.util.Scanner;
// class Main{
//     public static void main(String[]args){
//         Scanner Sc = new Scanner(System.in);
//         System.out.print("Enter a word to be reversed ");
//         String word=Sc.next();
//         Sc.close();
//         int length=word.length();
//         String reversedString="";
//         for (int i=length-1;i>=0;i--){
//             reversedString+=word.charAt(i);
//             System.out.println(reversedString);
//         }
//     }
// }
//    while loop
// class WhileLoop{
//     public static void main(String[] args){
//         int i=1;
//         while (i<10){
//             System.out.println(i);
//             i++;

//         }
//         int j=2;
//         do{
//             System.out.println(j);
//             j+=2;

//         }while(j<10);
//     }
// }


// class WhileLoop{
//     public static void main(String[] args){
//         int i=1;
//         while (i<101){
//             System.out.println(i);
//             i++;

//         }
//     }
// }

// import java.util.Scanner;
// class WhileLoop{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a num:");
//         int i=sc.nextInt();
//         int j=1;
//         do{
//             System.out.println(i+"x"+ j +"="+(i*j)+"\t");
//                         j++;
//         }while(j<=10);
//     }
// }



// import java.util.Scanner;
// public class Main {
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         scanner.close();
//         int digitCount = 0;
//         while (number!=0){
//             number/=10;
//             digitCount++;

//         }
//         System.out.println("The total number of digits in given number is " + digitCount);
//     }
    
// }

// public class Main{
//     public static int add(int a, int b){
//         int sum=a+b;
//         return sum;
        
//     }

//     public static void multiply(int a,int b){
//         System.out.println(a*b);
//     }

    
//     public static void main(String[] args){
//         int sum=add(1, 5);
//         multiply(1,5);

//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         greet();  
//     }

//     public static void greet() {
//         System.out.println("hello");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Main obj = new Main();  
//         obj.greet();  
//     }

//     public void greet() {
//         System.out.println("hello");
//     }
// }


// import java.util.Scanner;
// public class Main {

//     public static boolean isPrime(int n) {
//         if (n <= 1)
//             return false;
//         if (n <= 3)
//             return true;
//         if (n % 2 == 0 || n % 3 == 0)
//             return false;

//         for (int i = 5; i * i <= n; i += 6) {
//             if (n % i == 0 || n % (i + 2) == 0)
//                 return false;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number: ");
    
//         int number=sc.nextInt();
//         if (isPrime(number)) {
//             System.out.println(number + " is a prime number.");
//         } else {
//             System.out.println(number + " is not a prime number.");
//         }
//     }
// }



// import java.util.Scanner;
// public class Main {

//     public static boolean isEven(int n) {
//         if (n <= 1)
//             return false;
//         if (n %2==0)
//             return true;
           
//         if (n % 2 != 0 )
//             return false;

       
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number: ");
    
//         int number=sc.nextInt();
//         if (isEven(number)) {
//             System.out.println(number + " is even number.");
//         } else {
//             System.out.println(number + " is odd number.");
//         }
//     }
// }


// import java.util.Scanner;
// public class Main {

//     public static void printTable(int n) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " x " + i + " = " + (n * i));
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number: ");
    
//         int number=sc.nextInt();
//         printTable(number);
//     }
// }


// import java.util.Scanner;
// public class Main {

//     public static int multiplyThreeNumbers(int a, int b, int c) {
//         return a * b * c;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 1st number: ");
    
//         int num1=sc.nextInt();

//         System.out.println("Enter 2nd number: ");
    
//         int num2=sc.nextInt();

//         System.out.println("Enter 3rd number: ");
    
//         int num3=sc.nextInt();


//         int result = multiplyThreeNumbers(num1, num2, num3);

//         System.out.println("The result of multiplying " + num1 + ", " + num2 + ", and " + num3 + " is: " + result);
//     }
   
// }


// import java.util.Scanner;
// public class Main {

//     public static void calculateSimpleInterest(double principal, double rate, double time) {
//         double interest = (principal * rate * time) / 100;
//         System.out.println("The Simple Interest is: " + interest);
//     }    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the principal amount: ");
//         double principal = sc.nextDouble();

//         System.out.println("Enter the rate of interest: ");
//         double rate = sc.nextDouble();

//         System.out.println("Enter the time period in years: ");
//         double time = sc.nextDouble();

//         calculateSimpleInterest(principal, rate, time);    }
   
// }



// import java.util.Scanner;
// public class Main {

//     public static double calculateArea(double length, double width) {
//         return length * width;
//     }
//         public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the length of the rectangle: ");
//         double length = sc.nextDouble();

//         System.out.println("Enter the width of the rectangle: ");
//         double width = sc.nextDouble();

//         double area = calculateArea(length, width);

//         System.out.println("The area of the rectangle is: " + area);   
// }
// }

// import java.util.Scanner;
// public class Main {

//     public static long calculateFactorial(int n) {
//         long factorial = 1;
//         for (int i = 1; i <= n; i++) {
//             factorial *= i;
//         }
//         return factorial;
//     }
//         public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number to calculate its factorial: ");
//         int num = sc.nextInt();

//         long result = calculateFactorial(num);

//         System.out.println("The factorial of " + num + " is: " + result);}
// }



// import java.util.Scanner;
// public class Main {

//     public static long calculateFactorial(int n) {
//         long factorial = 1;
//         for (int i = 1; i <= n; i++) {
//             factorial *= i;
//         }
//         return factorial;
//     }
//         public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number to calculate its factorial: ");
//         int num = sc.nextInt();

//         long result = calculateFactorial(num);

//         System.out.println("The factorial of " + num + " is: " + result);}
// }



// public class Main{

//     static void calculateDiscount(double price, double discount){
//         double discountedPrice=*discount;
//         double finalPrice=price-discountedPrice;
//         System.out.println(finalPrice);
//     }
//     public static void main(String[] args){
//         double foodPrice=10.2;
//         double foodDiscount=0.5;
//         calculateDiscount(foodPrice, foodDiscount);

//         double clothesPrice=10.2;
//         double clothesDiscount=0.5;
//         calculateDiscount(clothesPrice, clothesDiscount);
        

//     }
// }

// import java.util.Scanner;

// public class Main {

//     static void checkEligibility(int age){
//         if(age>=18){
//             System.out.println("You can vote ");
//         }
//         else{
//             System.out.println("you cannot vote");
//         }

//     }
//         public static void main (String[] args){
//           Scanner sc= new Scanner(System.in);
//           System.out.println("Enter your age: ");
//           int age=sc.nextInt();
//           checkEligibility(age);
//           sc.close();
//         }}

        
// import java.util.Scanner;
// public class Main{

    
//         public static double calculateSimpleInterest(double principal, double rate, double time) {
//             return (principal * rate * time) / 100;
//         }
    
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
    
//             System.out.print("Enter Principal amount: ");
//             double principal = scanner.nextDouble();
    
//             System.out.print("Enter Rate of interest (%): ");
//             double rate = scanner.nextDouble();
    
//             System.out.print("Enter Time (in years): ");
//             double time = scanner.nextDouble();
    
//             double interest = calculateSimpleInterest(principal, rate, time);
    
//             System.out.println("Simple Interest is: " + interest);
    
//             scanner.close();
//         }
//     }
    

//arrays
public class Main{
    public static void main(String[]args){
        //int[]array1;
        //array1=new int[5];
        int[] array1=new int [5];
        //array1[5]=2;
        int len= array1.length;
        int[] array2={1,2,3,4,5};

    }

}