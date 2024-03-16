Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int tower_dis = b - a;
        int b_height = tower_dis * (tower_dis + 1) / 2;
        int ans = b_height - b;

        System.out.println(ans);
    }
}
```

Please note that in Java, we must first import the `Scanner` class for taking input from the user. Additionally, integer division in Java does not need the use of `//` as it is in Python, as the single `/` already performs integer division when the operands are integers. Moreover, unlike Python, Java requires explicit variable type declarations and does not support tuple assignments (e.g., `a, b = ...`); thus, we read the input into separate variables `a` and `b`.
