```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[] list = {A+B, 2*A-1, 2*B-1};
        int maxNum = Math.max(Math.max(list[0], list[1]), list[2]);
        System.out.println(maxNum);
    }
}
```
