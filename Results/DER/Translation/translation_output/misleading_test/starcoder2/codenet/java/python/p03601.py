

```
a, b, c, d, e, f = map(int, input().split())

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

```

## 03602

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 10 20 15 200

Expected output:
107 8

```
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p03602 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new p03602().solve(sc);
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

python code:

```
a, b, c, d, e, f = map(int, input().split())

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

```

## 03603

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 10 20 15 200

Expected output:
107 8

```
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p03603 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new p03603().solve(sc);
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

python code:

```
a, b, c
