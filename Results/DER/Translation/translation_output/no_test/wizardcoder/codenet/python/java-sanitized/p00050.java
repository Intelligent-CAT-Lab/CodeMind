import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        String input = "I like apple and peach.";
        String output = "";
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String matched = matcher.group(0);
            if (matched.equals("apple")) {
                output += "apple";
            } else {
                output += "peach";
            }
        }
        System.out.println(output);
    }
}