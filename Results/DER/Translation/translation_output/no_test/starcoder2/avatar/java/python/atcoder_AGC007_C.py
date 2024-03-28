
```
import math

N, d, x = map(float, input().split())
ans = 0
while N > 0.5:
    ans += d + x * (N - 0.5)
    d = (N + 1) * d / N + (5 * x) / (2 * N)
    x = (1 + (2 / N)) * x
    N -= 1

print(ans)
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class atcoder_AGC007_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; ++i) {
            p[i] = scan.nextInt();
        }

        int[] left = new int[N];
        int[] right = new int[N];
        for (int i = 0; i < N; ++i) {
            left[i] = i + 1;
            right[i] = N - i;
        }

        for (int i = 0; i < N; ++i) {
            int idx = p[i] - 1;
            int tmp = left[idx];
            left[idx] = right[idx];
            right[idx] = tmp;
        }

        for (int i = 0; i < N; ++i) {
            System.out.println(left[i] + " " + right[i]);
        }
    }
}
```

python code:
```
N = int(input())
p = list(map(int, input().split()))

left = [i + 1 for i in range(N)]
right = [N - i for i in range(N)]

for i in range(N):
    idx = p[i] - 1
    left[idx], right[idx] = right[idx], left[idx]

for i in range(N):
    print(left[i], right[i])
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class atcoder_AGC007_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        char[][] a = new char[H][W];
        for (int i = 0; i < H; ++i) {
            a[i] = scan.next().toCharArray();
        }

        int x = 0;
        int y = 0;
        while (x < W && y < H) {
            if (a[y][x] == '#') {
                ++x;
            } else {
                ++y;
            }
        }

        if (x == W && y == H) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
```

python code:
```
H, W = map(int, input().split())
a = [input() for _ in range(H)]

x = 0
y = 0
while x < W and y < H:
    if a[y][x] == '#':
        x += 1
    else:
        y += 1

if x == W and y == H:
    print('Possible')
else:
    print('Impossible')
```
/2019/04/20190426.md
# 20190426

## 1.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class atcoder_ABC001_C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int deg = scan.nextInt();
        int dis = scan.nextInt();

        int wind = (int) Math.round(dis / 60.0);
        if (wind >= 15) {
            System.out.println("C 5");
        } else if (wind >= 11) {
            System.out.println("C 4");
        } else if (wind >= 7) {
            System.out.println("C 3");
        } else if (wind >= 3) {
            System.out.println("C 2");
        } else if (wind >= 1) {
            System.out.println("C 1");
        } else {
            System.out.println("C 0");
        }

        if (deg >= 34875 || deg < 1125) {
            System.out.println("N");
        } else if (deg >= 33375) {
            System.out.println("NNE");
        } else if (deg >= 31875) {
            System.out.println("NE");
        } else if (deg >= 30375) {
            System.out.println("ENE");
        } else if (deg >= 28875) {
            System.out.println("E");
        } else if (deg >= 27375) {
            System.out.println("ESE");
        } else if (deg >= 25875) {
            System.out.println("SE");
        } else if (deg >= 24375) {
            System.out.println("SSE");
        } else if (deg >= 22875) {
            System.out.println("S");
        } else if (deg >= 21375) {
            System.out.  } else if (deg >= 13125) {
            System.out.println("SSW");
        } else if (deg >= 11625) {
            System.out.println("SW");
        } else if (deg >= 10125) {
            System.out.println("WSW");
        } else if (deg >= 8625) {
            System.out.println("W");
        } else if (deg >= 7125) {
            System.out.println("WNW");
        } else if (deg >= 5625) {
            System.out.println("NW");
        } else if (deg >= 4125) {
            System.out.println("NNW");
        } else {
            System.out.println("N");
        }
    }
}
```

python code:
```
deg, dis = map(int, input().split())

wind = round(dis / 60)
if wind >= 15:
    print('C 5')
elif wind >= 11:
    print('C 4')
elif wind >= 7:
    print('C 3')
elif wind >= 3:
    print('C 2')
elif wind >= 1:
    print('C 1')
else:
    print('C 0')

if deg >= 34875 or deg < 1125:
    print('N')
elif deg >= 33375:
    print('NNE')
elif deg >= 31875:
    print('NE')
elif deg >= 30375:
    print('ENE')
elif deg >= 28875:
    print('E')
elif deg >= 27375:
    print('ESE')
elif deg >= 25875:
    print('SE')
elif deg >= 24375:
    print('SSE')
elif deg
