import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(",");
        String output = "";
        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                output += word + " ";
            }
        }
        System.out.println(output.trim());
    }
}