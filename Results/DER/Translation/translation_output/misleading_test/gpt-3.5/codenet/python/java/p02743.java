```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            System.out.println((4 * a * b < Math.pow(c - a - b, 2)) ? "Yes" : "No");
        }
    }
}
```
