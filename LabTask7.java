import java.util.Scanner;
public class LabTask7 {
   public static void printMatrix(int n) {
    int r;
   for(int i = 0;i<n;i++){
      for(int j = 0; j<n;j++){
       r = (int)(Math.random()*2);
       System.out.print(r + " " );
      } 
     System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        printMatrix(num);
    input.close();
     }
}