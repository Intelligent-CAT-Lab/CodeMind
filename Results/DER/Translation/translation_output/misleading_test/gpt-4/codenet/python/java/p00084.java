Here's the translated code in Java with a provided sample test case:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class FilterWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] codeArray = code.split("\\s+");
        
        ArrayList<String> list = new ArrayList<>();
        
        for (String var : codeArray) {
            if (var.length() >= 3 && var.length() <= 6) {
                list.add(var);
            }
        }
        
        for (String var : list) {
            System.out.print(var + " ");
        }
        
        scanner.close();
    }
}
```

Java's `Scanner` class allows us to read the input from the user (similar to `raw_input` in Python). The `String`'s `replace` and `split` methods are used to process the input string similarly to Python's string methods. Java requires explicit import of the `ArrayList` and `Scanner` classes.

Regarding the print statement, Java overloads the `+` operator for `String` concatenation, hence `var + " "` is used to print the word followed by a space. The result is printed on the same line using `System.out.print`.

Assuming the input to this program is "Rain, rain, go to Spain.", the program will output "rain Spain " followed by a space at the end. If you want to exactly replicate the Python behavior—where no extra space is printed at the end—you can adjust the Java printing loop in the following way:

```java
for (int i = 0; i < list.size(); i++) {
    System.out.print(list.get(i));
    if (i < list.size() - 1) {
        System.out.print(" ");
    }
}
```

This adjustment ensures that a space is only printed between words, not after the last word.
