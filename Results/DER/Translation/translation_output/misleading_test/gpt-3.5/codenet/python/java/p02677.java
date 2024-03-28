```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        double l = H * 360 / 12.0 + M * 30 / 60.0;
        double s = M * 360 / 60.0;
        double ang = Math.abs(l - s);
        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2 * B * A * Math.cos(Math.toRadians(ang));

        System.out.println(Math.sqrt(c));
    }
}
```
