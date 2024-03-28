Here's the translated Java code for the provided Python script. I've used a `Scanner` to read the input, similar to the `input()` function in Python:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        
        int result = b / x - (a - 1) / x;
        
        System.out.println(result);
        
        scanner.close();
    }
}
```

To use this Java program, compile and run it in your Java environment. When prompted, enter your test input as a space-separated string (e.g., `4 8 2`). The program will then output the expected result (`3` in this case).
