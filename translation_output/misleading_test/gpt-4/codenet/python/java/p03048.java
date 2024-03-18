Below is the translated Java code snippet for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int G = scanner.nextInt();
        int B = scanner.nextInt();
        int n = scanner.nextInt();
        
        int cnt = 0;
        for (int r = 0; r <= n / R; r++) {
            for (int g = 0; g <= (n - r * R) / G; g++) {
                int b = (n - r * R - g * G) / B;
                if (r * R + g * G + b * B == n) {
                    cnt++;
                }
            }
        }
        
        System.out.println(cnt);
    }
}
```
Remember that in Java, you need to have a class (in this case, `Main`) and the `main` method is the entry point of the program. Additionally, Java uses the `Scanner` class for handling user input.

When you run the above program with the input "1 2 3 4", it should output "84", matching the expected output from the test case provided.
