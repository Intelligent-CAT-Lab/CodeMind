Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class OddLengthCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        
        for (int i = 1; i <= n; i++) {
            String hoge = Integer.toString(i);
            if (hoge.length() % 2 == 1) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```

To execute this Java code, you would compile it with `javac OddLengthCounter.java` and then run it with `java OddLengthCounter`, entering `11` when prompted to replicate the test case provided.
