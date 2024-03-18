```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int n = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int sqrtn = (int) Math.sqrt(n);

        boolean found = false;
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No");
        }
    }
}
```
