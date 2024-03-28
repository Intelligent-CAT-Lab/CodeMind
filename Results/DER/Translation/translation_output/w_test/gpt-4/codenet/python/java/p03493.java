Certainly! Below is the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class CountOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
        scanner.close(); // closing the scanner to prevent resource leaks
    }
}
```

This Java program reads a line from the standard input and counts the occurrences of the character '1' in that input, then prints out the count. Remember that you would need to compile and run this Java program from the command line or within an IDE to test it with your sample input.
