Here's the translation of the provided Python code into Java. The code takes a single lowercase alphabet character as input, finds its successive character, and prints that.

```java
import java.util.Scanner;

public class NextCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking the input character as a string to simplify the reading process.
        String input = scanner.next();
        scanner.close();

        char C = input.charAt(0);
        char nextChar = (char) (C + 1);

        // Since we want to handle the wrap-around case for 'z' to 'a',
        // we check if the nextChar is beyond 'z', in which case we reset it to 'a'.
        // But the logic provided in the question is considering nextChar after 'z' as 'b', therefore
        // special handling for 'z' as input: 'z' + 1 == 'a' + 25, which means 'b'.
        if (nextChar > 'z') {
            nextChar = (char) ((nextChar - 'a') % 26 + 'a');
        }

        System.out.println(nextChar);
    }
}
```

The above Java code assumes that the input character `C` is a lowercase letter from the English alphabet ('a' - 'z'). It computes the next character by simply adding `1` to the `char` value of `C` since the characters in Java are represented by their UTF-16 code units which are consecutive for the English lowercase alphabet. The wrap-around case for 'z' is handled by a conditional check. 

Now, according to the Python code logic, the output for the test input 'a' should be 'b'. Please note that you need to compile and run the Java program using the `javac` and `java` commands to execute and obtain the output.

Keep in mind that the Java code I provided includes a scanner object to take input from the console. When you run the Java code, make sure to provide the expected input `a`.
