import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] words = {"apple", "peach"};
        String[] replacements = {"peach", "apple"};

        String output = input;
        for (int i = 0; i < words.length; i++) {
            output = output.replaceAll(words[i], replacements[i]);
        }

        System.out.println(output);
    }
}