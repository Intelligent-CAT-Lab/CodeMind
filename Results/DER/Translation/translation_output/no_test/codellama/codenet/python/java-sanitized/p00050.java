import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        String input = "apple peach";
        String pattern = "(apple|peach)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String replacement = m.group(0).equals("apple") ? "apple" : "peach";
            m.appendReplacement(sb, replacement);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}