import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(",");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i].trim();
            if (word.length() >= 3 && word.length() <= 6) {
                result[i] = word;
            }
        }
        for (String word : result) {
            System.out.print(word + " ");
        }
    }
}