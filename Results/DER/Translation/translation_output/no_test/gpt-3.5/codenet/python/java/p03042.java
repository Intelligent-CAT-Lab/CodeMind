```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int a = Integer.parseInt(n.substring(0, 2));
        int b = Integer.parseInt(n.substring(2, 4));

        if (b == 0 || b > 12) {
            if (a >= 1 && a <= 12) {
                System.out.println("MMYY");
            } else {
                System.out.println("NA");
            }
        } else if (a >= 1 && a <= 12) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("YYMM");
        }
    }
}
```
