Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String A = "CODEFESTIVAL2016";
        int cnt = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != S.charAt(i)) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, compares it with the string "CODEFESTIVAL2016", and counts the number of characters that are different. The result is then printed to the console.
