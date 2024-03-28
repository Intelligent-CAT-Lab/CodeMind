Here's the equivalent Java code for the provided Python script:

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

This Java program will behave similarly to the Python code you provided. When run with the input `BBW`, it will produce the output `45`.

Make sure to compile the Java program and run it to test with different inputs as needed.
