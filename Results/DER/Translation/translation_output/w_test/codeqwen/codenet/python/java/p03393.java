Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char tmp = (char) (i + 'a');
                if (!s.contains(String.valueOf(tmp))) {
                    System.out.println(s + tmp);
                    return;
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (int j = s.charAt(i) + 1; j <= 'z'; j++) {
                    if (!s.substring(0, i).contains(String.valueOf((char) j))) {
                        System.out.println(s.substring(0, i) + (char) j);
                        return;
                    }
                }
            }
            System.out.println(-1);
            return;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, checks if the string's length is less than 26, and if so, it finds the first missing character and appends it to the end of the string. If the string's length is 26 or more, it finds the first missing character in the string and appends it to the beginning of the string. If no such character exists, it prints -1.
