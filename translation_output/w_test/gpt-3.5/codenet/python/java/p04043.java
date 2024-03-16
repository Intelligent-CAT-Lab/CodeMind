```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (Arrays.equals(Arrays.stream(new int[]{a, b, c}).sorted().toArray(), new int[]{5, 5, 7})) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
