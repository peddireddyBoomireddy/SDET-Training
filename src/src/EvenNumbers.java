import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {  // Loop from 1 to 100
            if (i % 2 == 0) {             // Check if the number is even
                System.out.println(i+"its even number");    // Print the even number
            }
            else {
                System.out.println(i+ "odd number");

            }

        }
        System.out.println("*****");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean continueLoop = true;
        int num1,num2;

        while (continueLoop) {
            System.out.println("\nEnter numbers to num1:");
            num1 = scanner.nextInt();
            System.out.println("\nEnter numbers to num2:");
            num2 = scanner.nextInt();
            sum = num1 + num2;
            System.out.println("sum of the two numbers is:" +sum);
            continueLoop=false;

        }
    }
}