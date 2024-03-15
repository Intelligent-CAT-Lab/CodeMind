Here is the translated Java code from the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int cnt = 0;
        int l = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                cnt += i - l;
                l += 1;
            }
        }

        System.out.println(cnt);
    }
}
```

Make sure to encapsulate this logic in a class and include necessary imports. This code reads a string from the standard input, iterates through each character of the string, and computes the distance that 'W's need to be moved to get all 'W's to the front of the string.
