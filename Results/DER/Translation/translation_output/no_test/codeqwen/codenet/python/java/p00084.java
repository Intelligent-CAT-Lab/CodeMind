Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String code = "your input here";
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] codeArray = code.split(" ");

        List<String> list = new ArrayList<>();

        for (String var : codeArray) {
            if (var.length() >= 3 && var.length() <= 6) {
                list.add(var);
            }
        }

        for (String var : list) {
            System.out.print(var + " ");
        }
    }
}
```

Please replace "your input here" with the actual input you want to use. This Java code does the same thing as your Python code: it removes commas and periods from the input, splits the input into words, and then prints out the words that have between 3 and 6 characters.
