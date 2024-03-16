Here's the Java code that performs the same function as the provided Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.length() / 2 - countOccurrences(s, 'p'));
        sc.close();
    }
    
    private static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
```

When you provide "gpg" as input to this Java program, the expected output will be 0, just like the Python code.
