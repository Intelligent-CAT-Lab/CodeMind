Here is the Java equivalent of the given Python code enclosed within ```java```:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        
        if (numbers[0] == 5 && numbers[1] == 5 && numbers[2] == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

When you provide the input "5 5 7" to this program, it will print "YES" as expected in the output.
