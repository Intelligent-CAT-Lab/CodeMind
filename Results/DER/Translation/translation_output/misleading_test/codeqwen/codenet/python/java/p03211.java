Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int a = 99999;
        for (int i = 0; i < S.length() - 2; i++) {
            int num = Integer.parseInt(S.substring(i, i + 3));
            a = Math.min(Math.abs(753 - num), a);
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over the string, taking three characters at a time and converting them to an integer. It then calculates the absolute difference between 753 and the integer, and updates the minimum value found so far. Finally, it prints out the minimum value.
