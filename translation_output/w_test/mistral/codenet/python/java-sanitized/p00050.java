import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        String input = "the cost of one peach is higher than that of one apple.";
        String pattern = "\\b(apple|peach)\\b";
        Matcher matcher = Pattern.compile(pattern).matcher(input);
        String output = "";
        while (matcher.find()) {
            String group = matcher.group(0);
            if (group.equals("apple")) {
                output += "the cost of one apple is higher than that of one peach.\n";
            } else {
                output += "the cost of one peach is higher than that of one apple.\n";
            }
        }
        System.out.println(output);
    }
}