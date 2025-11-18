import java.util.Scanner;
public class LabTask2{
   public static int reverse(int number){
     int rev=0;
     int digit;
      while (number!=0){
      digit = number%10;
      rev = rev*10 + digit;
      number=number/10;
     }
     return rev;
}
public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}








