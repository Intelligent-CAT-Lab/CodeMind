import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class p00050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
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
        System.out.println(sb.toString());
    }
}