import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            if (matcher.group().equals("apple")) {
                matcher.appendReplacement(stringBuffer, "0");
            } else {
                matcher.appendReplacement(stringBuffer, "1");
            }
        }
        matcher.appendTail(stringBuffer);
        System.out.println(stringBuffer.toString());
    }
}