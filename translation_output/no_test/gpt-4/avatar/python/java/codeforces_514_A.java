Certainly! Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        StringBuilder st = new StringBuilder();
        
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
        
        System.out.println(Integer.parseInt(st.toString()));
    }
}
```
In this Java code:
- I included the necessary import statement for the Scanner class, which is equivalent to the `input()` function in Python.
- Converted print to System.out.println.
- Used StringBuilder instead of string concatenation in loops to optimize performance.
- Replaced the subscript notation `[]` with `charAt` for accessing characters in strings.
- `substring` method is used to emulate the slicing of strings like `ip[1:]` in Python.
- Retrieving the numeric value of a character is done using `Character.getNumericValue()` method.
- Java's string are immutable, hence `StringBuilder` is used for efficient string manipulation during the loop.
- At the end, converted the StringBuilder to a String and parsed it into an integer before printing.
