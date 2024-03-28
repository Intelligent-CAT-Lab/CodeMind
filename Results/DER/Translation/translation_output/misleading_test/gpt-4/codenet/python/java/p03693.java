Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        
        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

When you run this Java program and input `4 3 2` as the test case, it will output:

```
YES
```
