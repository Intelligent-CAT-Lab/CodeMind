import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input:");
        String input = scanner.nextLine();
        scanner.close();

        // Define the pattern to match "apple" or "peach"
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);

        // Use a StringBuffer to hold the result
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            // Replace "apple" with "peach" and "peach" with "apple"
            matcher.appendReplacement(result, matcher.group().equals("apple") ? "peach" : "apple");
        }
        // Append the rest of the input
        matcher.appendTail(result);

        // Output the result
        System.out.println(result);
    }
}