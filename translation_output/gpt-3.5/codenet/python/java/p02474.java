```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        int result = Integer.parseInt(a[0]) * Integer.parseInt(a[1]);
        System.out.println(result);
    }
}
```
