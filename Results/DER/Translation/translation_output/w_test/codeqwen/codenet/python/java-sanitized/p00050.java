import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        String input = "the cost of one peach is higher than that of one apple.";
        System.out.println(replaceWords(input));
    }

    public static String replaceWords(String input) {
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(0).equals("apple") ? "peach" : "apple");
        }
        matcher.appendTail(sb);

        return sb.toString();
    }
}