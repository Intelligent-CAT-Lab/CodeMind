import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String output = switchFruits(input);
        System.out.println(output);
    }

    private static String switchFruits(String input) {
        Pattern pattern = Pattern.compile("apple|peach");
        Matcher matcher = pattern.matcher(input);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            if (matcher.group(0).equals("apple")) {
                matcher.appendReplacement(sb, "peach");
            } else {
                matcher.appendReplacement(sb, "apple");
            }
        }
        matcher.appendTail(sb);

        return sb.toString();
    }
}