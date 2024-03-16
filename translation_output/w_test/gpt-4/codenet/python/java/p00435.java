Certainly! Here's the equivalent Java code for the Python snippet you've provided. This code reads an input string, shifts characters as specified in your Python code, and prints the transformed result.

```java
import java.util.Scanner;

public class CharacterShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        scanner.close();

        StringBuilder list = new StringBuilder();
        for (int i = 0; i < w.length(); i++) {
            char letter = w.charAt(i);
            if (letter == 'C') {
                list.append('Z');
            } else if (letter == 'B') {
                list.append('Y');
            } else if (letter == 'A') {
                list.append('X');
            } else {
                char c = (char) (letter - 3);
                list.append(c);
            }
        }
        String l = list.toString();
        System.out.println(l);
    }
}
```

To test this Java code with the input "MRL", you can run the program and enter the input when prompted. The expected output will be "JOI", as per the test case provided.
