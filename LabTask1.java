import java.util.Scanner;
public class LabTask1{
   public static int sumDigit(long n){
    long x =0;
    long sum = 0;
   while (n!=0){
     x = n%10;
     n=n/10;
     sum+=x;
     }
   return((int)sum);
}
    public static void reverse(int number){
     while (number!=0){
    System.out.print(number%10);
     number=number/10;
}
}
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number(for sum) : ");
      long a = input.nextLong();
      System.out.println("The sum of digit " + a +" is "+sumDigit(a));
      System.out.println("Enter a number(for reverse) : ");
      int b = input.nextInt();
      reverse(b);
      input.close();
      }
}
