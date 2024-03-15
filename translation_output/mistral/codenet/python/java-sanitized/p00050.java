import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class p00050 {
    public static void main(String[] args) {
        String input = "apple";
        String pattern = "apple|peach";
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("peach");
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        if (m.find()) {
            fruits.add(m.group(0));
        }
        System.out.println(fruits);
    }
}