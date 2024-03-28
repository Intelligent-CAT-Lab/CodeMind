```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        if (X >= 400 && X <= 599) {
            System.out.println(8);
        } else if (X >= 600 && X <= 799) {
            System.out.println(7);
        } else if (X >= 800 && X <= 999) {
            System.out.println(6);
        } else if (X >= 1000 && X <= 1199) {
            System.out.println(5);
        } else if (X >= 1200 && X <= 1399) {
            System.out.println(4);
        } else if (X >= 1400 && X <= 1599) {
            System.out.println(3);
        } else if (X >= 1600 && X <= 1799) {
            System.out.println(2);
        } else if (X >= 1800 && X <= 1999) {
            System.out.println(1);
        }
    }
}
```
