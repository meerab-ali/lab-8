import java.util.Scanner;
public class LabTask5 {
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = input.nextLine();
        System.out.println("Number of letters in string \"" + a + "\" = " + countLetters(a));
        input.close();
    }
}
