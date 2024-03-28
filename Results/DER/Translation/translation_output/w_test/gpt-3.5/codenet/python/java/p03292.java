```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int res1 = Math.abs(a - b) + Math.abs(a - c);
        int res2 = Math.abs(a - b) + Math.abs(b - c);
        int res3 = Math.abs(a - c) + Math.abs(b - c);

        int result = Math.min(Math.min(res1, res2), res3);
        
        System.out.println(result);
    }
}
```
