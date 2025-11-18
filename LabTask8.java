import java.util.Scanner;
public class LabTask8 {
    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String line = input.nextLine();
        System.out.println("Number of Vowels in the string: " + countVowels(line));
        input.close();
    }
}
