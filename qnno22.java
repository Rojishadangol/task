import java.util.Scanner;

public class qnno22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed number: " + reversed);
    }
}