You can translate the given Python code into Java as follows:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input as a string
        String ip = scanner.next();
        StringBuilder st = new StringBuilder();
        
        // Condition checking for the length of the input string
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st.append("9");
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                int digit = Character.getNumericValue(ip.charAt(i));
                if (digit > 4) {
                    int n = 9 - digit;
                    st.append(n);
                } else {
                    st.append(digit);
                }
            }
        } else {
            st.append(ip);
        }
        
        // Parse the resulting string to an integer and print
        System.out.println(Integer.parseInt(st.toString()));
        
        scanner.close();
    }
}
```

You can run this Java code by providing an input like `5728`, and you should expect the output to be `4182`.

In this Java translation:
- A `Scanner` instance is used to read the input from the user.
- A `StringBuilder` is used instead of a Python string because Java strings are immutable.
- We're using a `for` loop to iterate through the characters of the `ip` string.
- `Character.getNumericValue(char c)` is used to convert a character representing a digit to its numerical value.
- The final `StringBuilder` is converted to a string and then parsed as an integer before being printed.
