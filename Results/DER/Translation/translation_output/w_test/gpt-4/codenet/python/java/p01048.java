Certainly! Here is the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int target = 1;
        
        while (true) {
            int count = 0;
            for (int i = 1; i <= target; i++) {
                if (target % i == 0) {
                    count++;
                }
            }
            if (count == N) {
                System.out.println(target);
                break;
            }
            target++;
        }
        scanner.close();
    }
}
```

To test this code with the test case input `1`, compile and run the `Main` class, then provide `1` as the input when prompted. The program will produce the expected output `1`.
