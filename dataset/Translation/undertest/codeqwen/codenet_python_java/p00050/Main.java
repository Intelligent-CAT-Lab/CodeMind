import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        String input = System.console().readLine();
        System.out.println(replaceAppleOrPeach(input));
    }

    public static String replaceAppleOrPeach(String input) {
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);
        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            if (matcher.group().equals("apple")) {
                matcher.appendReplacement(sb, "apple");
            } else {
                matcher.appendReplacement(sb, "peach");
            }
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}