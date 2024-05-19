System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 10 20 15 200

Expected output:
110 10


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


Answer:
```python
import sys

def solve(sc):
    a = sc.nextInt()
    b = sc.nextInt()
    c = sc.nextInt()
    d = sc.nextInt()
    e = sc.nextInt()
    f = sc.nextInt()

    water_x = 0
    ans_water = 100
    ans_sugar = 0
    while 100 * a * water_x <= f:
        water_y = 0
        while 100 * a * water_x + 100 * b * water_y <= f:
            water = 100 * a * water_x + 100 * b * water_y
            sugar_x = 0
            while water + c * sugar_x <= f:
                sugar_y = 0
                while water + c * sugar_x + d * sugar_y <= f:
                    sugar = c * sugar_x + d * sugar_y
                    if sugar * (100 + e) <= e * (water + sugar):
                        if sugar * (ans_water + ans_sugar) >= ans_sugar * (water + sugar):
                            ans_water = water
                            ans_sugar = sugar
                    sugar_y += 1
                sugar_x += 1
            water_y += 1
        water_x += 1

    print(ans_water + ans_sugar, ans_sugar)

def main():
    solve(sys.stdin)

if __name__ == "__main__":
    main()
```<|endoftext|>
