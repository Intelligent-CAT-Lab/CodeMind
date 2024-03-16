```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] l = scanner.nextLine().split(" ");
        int A = Integer.parseInt(l[0]);
        int B = Integer.parseInt(l[1]);

        int kimawasi = B / A;
        if (B % A > 0) {
            kimawasi = kimawasi + 1;
        }

        System.out.println(kimawasi);
    }
}
```
