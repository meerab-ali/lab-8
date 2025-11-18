import java.util.Scanner;

public class LabTask6 {
    public static String capitalize(String word) {
        if (word.isEmpty()) return word;
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = capitalize(words[i]);
        }
        System.out.println(String.join(" ", words));
        input.close();
    }
}
