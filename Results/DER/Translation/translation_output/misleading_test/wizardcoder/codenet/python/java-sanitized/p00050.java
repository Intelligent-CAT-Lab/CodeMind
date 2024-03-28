import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {
    public static void main(String[] args) {
        String input = "the cost of one peach is higher than that of one apple.";
        String output = input.replaceAll("(apple|peach)", (Matcher m) -> {
            String match = m.group(0);
            return match.equals("apple")? "a" : "e";
        });
        System.out.println(output);
    }
}


Output:

th] cost! ofq >one a.pze i8s hixgher than t[_I o ne each.