```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String fruit = matcher.group(0);
            if (fruit.equals("apple")) {
                matcher.appendReplacement(sb, "apple");
            } else if (fruit.equals("peach")) {
                matcher.appendReplacement(sb, "peach");
            }
        }
        matcher.appendTail(sb);

        System.out.println(sb.toString());
    }
}
```  
