import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class p00050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text:");
        String input = scanner.nextLine();
        scanner.close();

        Pattern pattern = Pattern.compile("apple|peach");
        Matcher matcher = pattern.matcher(input);

        UnaryOperator<String> replacer = m -> m.equals("apple") ? "peach" : "apple";

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, replacer.apply(matcher.group()));
        }
        matcher.appendTail(sb);

        System.out.println(sb.toString());
    }
}