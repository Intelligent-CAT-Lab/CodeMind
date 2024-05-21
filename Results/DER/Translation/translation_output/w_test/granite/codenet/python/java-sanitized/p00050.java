import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        String input = "the cost of one peach is higher than that of one apple.";
        String output = replaceWords(input);
        System.out.println(output);
    }

    public static String replaceWords(String input) {
        Pattern pattern = Pattern.compile("apple|peach");
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder();
        int lastIndex = 0;
        while (matcher.find()) {
            sb.append(input, lastIndex, matcher.start());
            sb.append(matcher.group(0).equals("apple")? "peach" : "apple");
            lastIndex = matcher.end();
        }
        sb.append(input.substring(lastIndex));
        return sb.toString();
    }
}