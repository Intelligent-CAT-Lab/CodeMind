Below is the Java translation of the given Python code. The Java code reads an input string, compares it with a predefined string, counts the differences, and prints the count.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        final String A = "CODEFESTIVAL2016";
        int cnt = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != S.charAt(i)) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
        scanner.close();
    }
}
```

Please note that this Java code assumes the input will be a single string passed through the standard input without any additional text or newline. It also assumes the input string length is equal to the length of the predefined string "CODEFESTIVAL2016". If you would like to add more error checking or input handling, please let me know!
