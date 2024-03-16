<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new p03601().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int waterX = 0;
        int ansWater = 100;
        int ansSugar = 0;
        while (100 * a * waterX <= f) {
            int waterY = 0;
            while (100 * a * waterX + 100 * b * waterY <= f) {
                int water = 100 * a * waterX + 100 * b * waterY;
                int sugarX = 0;
                while (water + c * sugarX <= f) {
                    int sugarY = 0;
                    while (water + c * sugarX + d * sugarY <= f) {
                        int sugar = c * sugarX + d * sugarY;
                        if (sugar * (100 + e) <= e * (water + sugar)) {
                            if (sugar * (ansWater + ansSugar) >= ansSugar * (water + sugar)) {
                                ansWater = water;
                                ansSugar = sugar;
                            }
                        }
                        sugarY++;
                    }
                    sugarX++;
                }
                waterY++;
            }
            waterX++;
        }

        System.out.println(ansWater + ansSugar + " " + ansSugar);
    }
}

```

@@ Response
```python
class p03601:
    def solve(self, sc):
        a = int(sc.readline())
        b = int(sc.readline())
        c = int(sc.readline())
        d = int(sc.readline())
        e = int(sc.readline())
        f = int(sc.readline())

        waterX = 0
        ansWater = 100
        ansSugar = 0
        while 100 * a * waterX <= f:
            waterY = 0
            while 100 * a * waterX + 100 * b * waterY <= f:
                water = 100 * a * waterX + 100 * b * waterY
                sugarX = 0
                while water + c * sugarX <= f:
                    sugarY = 0
                    while water + c * sugarX + d * sugarY <= f:
                        sugar = c * sugarX + d * sugarY
                        if sugar * (100 + e) <= e * (water + sugar):
                            if sugar * (ansWater + ansSugar) >= ansSugar * (water + sugar):
                                ansWater = water
                                ansSugar = sugar
                        sugarY += 1
                    sugarX += 1
                waterY += 1
            waterX += 1

        print(str(ansWater + ansSugar) + " " + str(ansSugar))


if __name__ == "__main__":
    import sys
    p03601().solve(sys.stdin)
```

Please note that Python does not have a direct equivalent to Java's `try-with-resources` statement. Therefore, the `try-with-resources` block in the Java code is replaced with a simple `if __name__ == "__main__":` block. The `sys.stdin` object is used to read from the standard input.<｜end▁of▁sentence｜>
