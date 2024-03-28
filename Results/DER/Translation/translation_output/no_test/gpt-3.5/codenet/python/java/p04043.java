```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);

        if (Arrays.equals(arr, new int[]{5, 5, 7})) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
