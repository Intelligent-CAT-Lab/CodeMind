import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] words = code.split(" ");

        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                System.out.print(word + " ");
            }
        }
    }
}