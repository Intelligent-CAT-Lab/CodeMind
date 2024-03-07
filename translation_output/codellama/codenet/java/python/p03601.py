<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def solve(sc):
    a, b, c, d, e, f = map(int, sc.readline().split())
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

if __name__ == "__main__":
    solve(sys.stdin)
```
This is the Python code equivalent to the Java code you provided. It uses the `sys` module to read input from stdin and the `map` function to convert the input string to a list of integers. The rest of the code is similar to the Java code, with a few minor changes to make it more Pythonic.</s>
