Here's the given Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int cnt1 = 0;
        int cnt2 = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    cnt1++;
                } else {
                    cnt2++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    cnt2++;
                } else {
                    cnt1++;
                }
            }
        }
        System.out.println(Math.min(cnt1, cnt2));
    }
}
```

This Java program will perform the same task as the Python code you provided. It uses a `Scanner` object to read the input from the console, processes the characters in the string according to the specified logic, and then prints out the minimum of `cnt1` and `cnt2`.
