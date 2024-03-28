```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b && a > c) {
            System.out.println("A");
        } else if (b > a && b > c) {
            System.out.println("B");
        } else if (c > a && c > b) {
            System.out.println("C");
        }
    }
}
```
