Here is the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class MinimizeDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        
        long ans = (long) Math.pow(10, 10);
        if (h % 3 == 0 || w % 3 == 0) {
            ans = 0;
        } else {
            if (h % 3 == 1) {
                long Sa = ((long) h / 3) * w;
                long Sb = Sa;
                long Sc = ((long) (h / 3) + 1) * w;
                long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                ans = Math.min(ans, dif);
            } else if (h % 3 == 2) {
                long Sa = ((long) h / 3) * w;
                long Sb = ((long) (h / 3) + 1) * w;
                long Sc = Sb;
                long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                ans = Math.min(ans, dif);
            }

            if (w % 3 == 1) {
                long Sa = ((long) w / 3) * h;
                long Sb = Sa;
                long Sc = ((long) (w / 3) + 1) * h;
                long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                ans = Math.min(ans, dif);
            } else if (w % 3 == 2) {
                long Sa = ((long) w / 3) * h;
                long Sb = ((long) (w / 3) + 1) * h;
                long Sc = Sb;
                long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                ans = Math.min(ans, dif);
            }

            if (h % 2 == 0) {
                for (int i = 1; i < w; i++) {
                    long Sa = ((long)h / 2) * i;
                    long Sc = (long)h * (w - i);
                    long dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else {
                for (int i = 1; i < w; i++) {
                    long Sa = ((long) h / 2) * i;
                    long Sb = ((long) (h / 2) + 1) * i;
                    long Sc = (long)h * (w - i);
                    long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                    ans = Math.min(ans, dif);
                }
            }

            if (w % 2 == 0) {
                for (int j = 1; j < h; j++) {
                    long Sa = ((long)w / 2) * j;
                    long Sc = (long)w * (h - j);
                    long dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else {
                for (int j = 1; j < h; j++) {
                    long Sa = ((long) w / 2) * j;
                    long Sb = ((long) (w / 2) + 1) * j;
                    long Sc = (long)w * (h - j);
                    long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                    ans = Math.min(ans, dif);
                }
            }
        }
        System.out.println(ans);
        
        scanner.close();
    }
}
```

Note that Java uses `Scanner` for input, and you'll need to handle the input parsing differently than in Python. I'm also assuming that the integers `h` and `w` will not be larger than the maximum value of `int` in Java (`2,147,483,647`). If they are, you'll need to change the data type for `h` and `w` to `long`.

The division logic has been directly translated, and we need to cast to `long` when doing the division operations to prevent overflow. Remember that Java does not have Python's `min` and `max` functions that accept multiple arguments, hence the nested `Math.min` and `Math.max` calls.
