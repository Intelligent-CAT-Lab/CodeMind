import java.util.regex.*;

public class p00050 {
    public static void main(String[] args) {
        String input = "the cost of one peach is higher than that of one apple.";
        String output = Pattern.compile("(apple|peach)").matcher(input).replaceAll(m -> m.group().equals("apple") ? "peach" : "apple");
        System.out.println(output);
    }
}