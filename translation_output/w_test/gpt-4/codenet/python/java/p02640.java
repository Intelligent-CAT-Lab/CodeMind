Here is the equivalent Java code that performs the same task as the provided Python code:

```java
import java.util.Scanner;

public class CheckLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 0;
        
        for (int a = 0; a <= x; a++) {
            int b = x - a;
            if ((2 * a + 4 * b) == y) {
                count = 1;
                break;
            }
        }
        
        System.out.println(count == 1 ? "Yes" : "No");
        scanner.close();
    }
}
```

This Java program uses the `Scanner` class to read two integer inputs from the standard input, and then it checks all possible combinations of `a` and `b` to find a match where `2a + 4b` equals `y`. If such a combination is found, it sets `count` to `1` and breaks the loop. After the loop, it prints "Yes" if `count` is `1`, otherwise it prints "No".
