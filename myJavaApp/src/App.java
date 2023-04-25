import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***************SIMPLE JAVA CALCULATOR*********************");
        // simple java calculator
       
        try (Scanner input = new Scanner(System.in)) {
            int num1;
            int num2;
            int sum = 0;

            // prompting user to enter number one
            System.out.print("Enter first number: ");
            num1 = input.nextInt();

            // prompting user to enter number two
            System.out.println("Enter second number: ");
            num2 = input.nextInt();

            // calculating sum
            sum = num1 + num2;

            // displaying result
            System.out.println("The sum is: " + sum);
        }
    }
}
