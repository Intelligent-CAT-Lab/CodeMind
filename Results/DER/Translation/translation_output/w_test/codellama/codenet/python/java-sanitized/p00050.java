import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        String input = "the cost of one peach is higher than that of one apple.";
        String pattern = "(apple|peach)";
        String replacement = "apple";
        String result = input.replaceAll(pattern, replacement);
        System.out.println(result);
    }
}