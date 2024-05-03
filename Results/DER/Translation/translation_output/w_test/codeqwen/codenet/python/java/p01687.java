Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String aizu = "AIZUNYAN";
        char[] ref = {'A', 'A', 'D', 'I', 'N', 'N', 'U', 'Y'};
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && Arrays.equals(Arrays.copyOfRange(inp.toCharArray(), i, i + 8), ref)) {
                    ans.append(aizu);
                    i += 8;
                } else {
                    ans.append(inp.charAt(i));
                    i += 1;
                }
            }
            System.out.println(ans.toString());
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, checks if its length is less than 8, and if so, prints the string. If the string's length is 8 or more, it checks if the substring from index i to i+8 is equal to the reference string. If it is, it appends the aizu string to the answer string and increments i by 8. If it isn't, it appends the character at index i to the answer string and increments i by 1. Finally, it prints the answer string.
