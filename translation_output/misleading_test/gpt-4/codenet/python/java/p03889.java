Here's the equivalent Java code to perform the same operations as the Python code you provided:

```java
import java.util.Scanner;

public class MirrorSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] s = input.toCharArray();
        char[] t = new char[s.length];

        // Reverse the input and perform transformations.
        for (int i = 0; i < s.length; i++) {
            char reversedChar = s[s.length - 1 - i];
            t[i] = reversedChar;
            if (t[i] == 'p') {
                t[i] = 'q';
            } else if (t[i] == 'q') {
                t[i] = 'p';
            } else if (t[i] == 'b') {
                t[i] = 'd';
            } else if (t[i] == 'd') {
                t[i] = 'b';
            }
        }

        String ans = new String(s).equals(new String(t)) ? "Yes" : "No";
        System.out.println(ans);
    }
}
```

To test this Java program with the test input you provided ("pdbq"), you'd simply run the program and type in "pdbq" when prompted for input by the scanner. The program will print "No" as the expected output.
