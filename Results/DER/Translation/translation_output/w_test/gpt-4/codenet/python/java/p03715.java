Below is the equivalent Java code for the given Python snippet:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        
        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            return;
        }
        
        int res = Math.min(h, w);
        for(int hi = 1; hi < h; hi++) {
            int b1 = hi * w;
            int b2 = (h - hi) * (w / 2);
            int b3 = (h - hi) * (w / 2 + w % 2);
            res = Math.min(res, Math.max(b1, Math.max(b2, b3)) - Math.min(b1, Math.min(b2, b3)));
        }
        for(int wi = 1; wi < w; wi++) {
            int b1 = wi * h;
            int b2 = (w - wi) * (h / 2);
            int b3 = (w - wi) * (h / 2 + h % 2);
            res = Math.min(res, Math.max(b1, Math.max(b2, b3)) - Math.min(b1, Math.min(b2, b3)));
        }

        System.out.println(res);
        
        scanner.close();
    }
}
```

To run this code in Java, copy the code to a file named `Main.java`, compile it using `javac Main.java` and run it with `java Main`. You will then be prompted to enter the values for `h` and `w`. Input these values separated by a space and press Enter, the expected output will then be displayed on the screen.
