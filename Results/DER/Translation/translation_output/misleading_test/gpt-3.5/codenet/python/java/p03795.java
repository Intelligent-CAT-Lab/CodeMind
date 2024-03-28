```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int result = 800 * N - 200 * (N / 15);
        System.out.println(result);
    }
}
```
