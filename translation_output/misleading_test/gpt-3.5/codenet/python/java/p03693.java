```java
import java.util.Scanner;

public class RGBDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, g, b;
        
        r = scanner.nextInt();
        g = scanner.nextInt();
        b = scanner.nextInt();

        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, g, b;

        r = scanner.nextInt();
        g = scanner.nextInt();
        b = scanner.nextInt();

        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
