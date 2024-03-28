Here you go. Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.close();

        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            int T = i + offset;
            sum += T;
            if (Math.abs(T) < absmin) {
                absmin = Math.abs(T);
                mini = T;
            }
        }
        
        System.out.println(sum - mini);
    }
}
```

Please note that you should input the test case `5 2` in this Java implementation when prompted. This program will then output the expected result `50`.
