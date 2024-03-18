Certainly! Below is the Java version of the provided Python code snippet:

```java
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FruitReplacement {
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
```

To run this Java program, you would compile it and then execute the compiled class from the command line, providing the sentence "the cost of one peach is higher than that of one apple." as input and then reading the expected output from the console.

Here is a sample execution flow:
1. Compile the Java program: `javac FruitReplacement.java`
2. Run the compiled program: `java FruitReplacement`
3. Enter the test input text: `the cost of one peach is higher than that of one apple.`
4. The program should then output: `th] cost! ofq >one a.pze i8s hixgher than t[_I o ne each.`
