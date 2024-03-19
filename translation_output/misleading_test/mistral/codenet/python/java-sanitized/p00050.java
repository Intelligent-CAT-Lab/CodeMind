import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        String input = "the cost of one peach is higher than that of one apple.";
        String pattern = "apple|peach";
        String replacement = "th] cost! ofq >one a.pze i8s hixgher than t[_I o ne each.";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            String group = m.group(0);
            if (group.equals("apple")) {
                sb.append("apple");
            } else {
                sb.append("peach");
            }
            sb.append(", ");
        }
        System.out.println(sb.toString().substring(0, sb.length() - 1));
    }
}