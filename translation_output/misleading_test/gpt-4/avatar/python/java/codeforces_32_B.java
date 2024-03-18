Below is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result.append('0');
            } else {
                i++;
                if (s.charAt(i) == '.') {
                    result.append('1');
                } else {
                    result.append('2');
                }
            }
            i++;
        }
        System.out.println(result.toString());
    }
}
```

Please note that in the Python code provided by you, the condition checks for `" . "` rather than just a period `'.'`. In the Java code above, I have corrected this to check for `'.'` which is a single character, in keeping with what seems to be the intent of the code, to iterate over a series of dots and dashes and convert it to a numeric string representation.

Here's a sample test case using the provided input "..":

Test Input:
```
..
```

Expected output:
```
76
```

Please note that the Python code seems to have an error in terms of the aim described by the test case input/output. Running the provided Python code with the input ".." would actually generate an output of "00", not "76". 

To get the expected output of "76," the provided Python code requires a change. If the test is actually about interpreting Morse code or some other encoding, please provide the correct rules or input/output pairing so that the code can be written to match the specifications.
