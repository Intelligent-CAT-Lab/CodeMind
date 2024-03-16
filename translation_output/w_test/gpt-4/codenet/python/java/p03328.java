Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int tower_dis = b - a;
        int b_height = tower_dis * (tower_dis + 1) / 2;
        int ans = b_height - b;
        
        System.out.println(ans);
    }
}
```

When you run this Java program, you can input `8 13` (followed by pressing Enter) and it should output `2`, which is the expected result. Make sure to input the numbers in the same line, separated by a space.
