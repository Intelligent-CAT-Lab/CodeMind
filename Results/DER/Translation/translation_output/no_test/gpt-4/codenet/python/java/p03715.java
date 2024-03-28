Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class MinimizeDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            return;
        }
        
        int res = Math.min(h, w);
        for (int hi = 1; hi < h; hi++) {
            int b1 = hi * w;
            int b2 = (h - hi) * (w / 2);
            int b3 = (h - hi) * (w / 2 + w % 2);
            res = Math.min(res, max(b1, b2, b3) - min(b1, b2, b3));
        }
        
        for (int wi = 1; wi < w; wi++) {
            int b1 = wi * h;
            int b2 = (w - wi) * (h / 2);
            int b3 = (w - wi) * (h / 2 + h % 2);
            res = Math.min(res, max(b1, b2, b3) - min(b1, b2, b3));
        }
        
        System.out.println(res);
        sc.close();
    }

    private static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    private static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
```

Make sure you have imported `java.util.Scanner` for the code to compile, as it is needed to take user input from the standard input. This Java code will give the same output as the provided Python code for corresponding inputs.
