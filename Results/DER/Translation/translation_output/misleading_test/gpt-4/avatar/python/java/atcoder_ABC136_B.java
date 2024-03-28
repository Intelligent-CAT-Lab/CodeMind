Here is the translated Python code into Java:

```java
import java.util.Scanner;

public class OddCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 1) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
        scanner.close();
    }
}
```

To test this Java code with the provided test input `99999`, run the program, input the number `99999`, and it should output the expected result `90984`.
