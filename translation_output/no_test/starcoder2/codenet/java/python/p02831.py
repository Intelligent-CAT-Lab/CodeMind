
```
A, B = map(int, input().split())

gcd = 0
for i in range(1, max(A, B)):
    if A % i == 0 and B % i == 0:
        gcd = i

lcm = A * B // gcd
print(lcm)
```

## 2. 1085

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, w, h;
        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
        sc.close();

        int min = Math.min(x, y);
        min = Math.min(min, w - x);
        min = Math.min(min, h - y);
        System.out.println(min);
    }
}
```

python code:
```
x, y, w, h = map(int, input().split())

min = min(x, y)
min = min(min, w - x)
min = min(min, h - y)
print(min)
```

## 3. 1087

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        int i = 1;
        while (sum < n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
```

python code:
```
n = int(input())

sum = 0
i = 1
while sum < n:
    sum += i
    i += 1
print(sum)
```

## 4. 1099

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int x = 1, y = 1;
        while (true) {
            if (map[x][y] == 2) {
                break;
            }
            if (map[x][y] == 1) {
                map[x][y] = 9;
            }
            if (map[x + 1][y] == 1) {
                if (map[x][y + 1] == 1) {
                    map[x][y] = 9;
                    break;
                } else {
                    map[x][y] = 9;
                    y++;
                }
            } else {
                x++;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

python code:
```
map = []
for i in range(10):
    map.append(list(map(int, input().split())))

x, y = 1, 1
while True:
    if map[x][y] == 2:
        break
    if map[x][y] == 1:
        map[x][y] = 9
    if map[x + 1][y] == 1:
        if map[x][y + 1] == 1:
            map[x][y] = 9
            break
        else:
            map[x][y] = 9
            y += 1
    else:
        x += 1

for i in range(10):
    for j in range(10):
        print(map[i][j], end=' ')
    print()
```

## 5. 11022

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.close();

        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
        }
    }
}
```

python code:
```
T = int(input())

for i in range(1, T + 1):
    A, B = map(int, input().split())
    print("Case #{}: {} + {} = {}".format(i, A, B, A + B))
```

## 6. 11023

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p11023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        sc.close();

        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += Integer.parseInt(s[i]);
        }
        System.out.println(sum);
    }
}
```

python code:
```
s = input().split()

sum = 0
for i in range(len(s)):
    sum += int(s[i])
print(sum)
```

## 7. 11024

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p11024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        sc.close();

        for (int i = 1; i <= T; i++) {
            String[] s = sc.nextLine().split(" ");
            int sum = 0;
            for (int j = 0; j < s.length; j++) {
                sum += Integer.parseInt(s[j]);
            }
            System.out.println(sum);
        }
    }
}
```

python code:
```
T = int(input())

for i in range(1, T + 1):
    s = input().split()
    sum = 0
    for j in range(len(s)):
        sum += int(s[j])
    print(sum)
```

## 8. 1110

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
