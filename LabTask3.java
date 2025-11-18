import java.util.Scanner;
public class LabTask3 {
    public static void displaySortedNumbers(double num1, double num2, double num3) {

        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1);
            if (num2 <= num3) {
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num2);
            }
        } 
        else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2);
            if (num1 <= num3) {
                System.out.println(num1);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num1);
            }
        } 
        else {
            System.out.println(num3);
            if (num1 <= num2) {
                System.out.println(num1);
                System.out.println(num2);
            } else {
                System.out.println(num2);
                System.out.println(num1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        displaySortedNumbers(a, b, c);
    }
}
