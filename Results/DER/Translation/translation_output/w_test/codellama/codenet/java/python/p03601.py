<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]

Here is the Python code that solves the problem:
```python
import sys

def solve(sc):
    a, b, c, d, e, f = map(int, sc.readline().split())
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
    solve(sys.stdin)
```
This code reads the input from `sys.stdin` and uses the `map` function to convert the input strings to integers. It then uses a nested loop to iterate over the possible values of `waterX` and `waterY`, and calculates the corresponding values of `water` and `sugar`. It checks if the current combination of `water` and `sugar` is the optimal one, and updates the `ansWater` and `ansSugar` variables accordingly. Finally, it prints the optimal values of `water` and `sugar`.</s>
