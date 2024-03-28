import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replace(",", "");
        input = input.replace(".", "");
        String[] words = input.split(" ");

        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                list.add(word);
            }
        }

        for (String word : list) {
            System.out.print(word + " ");
        }
    }
}