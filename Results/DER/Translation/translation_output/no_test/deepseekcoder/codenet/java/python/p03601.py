<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
class p03601:
    def solve(self, sc):
        a = sc.nextInt()
        b = sc.nextInt()
        c = sc.nextInt()
        d = sc.nextInt()
        e = sc.nextInt()
        f = sc.nextInt()

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

        print(ansWater + ansSugar, ansSugar)


if __name__ == "__main__":
    try:
        sc = Scanner(System.in)
        p03601().solve(sc)
    finally:
        sc.close()
```

Please note that the `Scanner` class in Python is equivalent to `java.util.Scanner` in Java. Also, the `nextInt()` method in Python is equivalent to `nextInt()` in Java. The `close()` method is used to close the scanner after we are done with it.
<|EOT|>
