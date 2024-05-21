import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        String input = "I like apples and peaches";
        String pattern = "(apple|peach)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        String result = m.replaceAll(m.group(0).equals("apple")? "apple" : "peach");
        System.out.println(result);
    }
}