Below is the equivalent code in Java:

```java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder myStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                myStr.append(c);
            } else if (i + 1 < s.length() && s.charAt(i+1) == 'B' && myStr.length() != 0) {
                myStr.deleteCharAt(myStr.length() - 1);
                i += 2; // Skip the space after 'B' as well
            }
        }

        System.out.println(Integer.parseInt(myStr.toString(), 2) - 128);
        scanner.close();
    }
}
```

Please note that the Python code seems to be looking for ' B ' specifically, which includes spaces before and after the 'B'. The Java code snippet shown above is doing the same, assuming the 'B' is always followed by a space. It skips the following space by incrementing the index `i` by 2 after removing the last character.

The additional line `Integer.parseInt(myStr.toString(), 2) - 128` is used because the expected output seems to suggest an interpretation of the resulting binary string as a byte and subtracting 128 from it. This line converts `myStr` from a binary string to an integer and then subtracts 128.

With the given test input "0000000000", the binary string would remain unchanged since there are no 'B' characters to trigger backspace functionality. The given output of -87 corresponds to subtracting 128 from the decimal value of "0000000000" interpreted as binary, which would be 0. However, the Python code provided does not attempt to convert to an integer and subtract 128; it only prints the manipulated string. If that is the desired functionality, please disregard the additional conversion and subtraction in the Java code.

Here's the simplified Java code without interpreting the string as binary and subtracting 128, which would exactly mimic the Python code:

```java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder myStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                myStr.append(c);
            } else if (i + 1 < s.length() && s.charAt(i+1) == 'B' && myStr.length() != 0) {
                myStr.deleteCharAt(myStr.length() - 1);
                i += 2; // Skip the space after 'B' as well
            }
        }

        System.out.println(myStr.toString());
        scanner.close();
    }
}
```
