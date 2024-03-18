```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int result = n == 0 ? 1 : 2 / n;
        System.out.println(result);
    }
}
```
