import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class p00050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replaceAll("(apple|peach)", m -> m.group().equals("apple") ? "apple" : "peach");
        System.out.println(output);
    }
}