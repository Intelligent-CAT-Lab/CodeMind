
```

str = input()
ch = [str[i] for i in range(4)]
a = int(ch[0])
b = int(ch[1])
c = int(ch[2])
d = int(ch[3])
ans = ['+'] * 3

if a + b + c + d == 7:
    pass
elif a + b + c - d == 7:
    ans[2] = '-'
elif a + b - c + d == 7:
    ans[1] = '-'
elif a - b + c + d == 7:
    ans[0] = '-'
elif a + b - c - d == 7:
    ans[1] = '-'
    ans[2] = '-'
elif a - b + c - d == 7:
    ans[0] = '-'
    ans[2] = '-'
elif a - b - c + d == 7:
    ans[0] = '-'
    ans[1] = '-'
elif a - b - c - d == 7:
    ans[0] = '-'
    ans[1] = '-'
    ans[2] = '-'

print(a, ans[0], b, ans[1], c, ans[2], d, '=7', sep='')

```


```

python code:
```

n = int(input())

for i in range(n):
    print(' ' * (n - i - 1), end='')
    print('*' * (2 * i + 1), end='')
    print(' ' * (n - i - 1))

```
/python/p03544.md
# p03544

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03544 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}/python/p03543.md
# p03543

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

```

python code:
```

n = int(input())

for i in range(n):
    print(' ' * (n - i - 1), end='')
    print('*' * (2 * i + 1))

```
/python/p03542.md
# p03542

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

```

python code:
```

n = int(input())

for i in range(n):
    print(' ' * (n - i - 1), end='')
    print('*' * (2 * i + 1))
for i in range(n - 2, -1, -1):
    print(' ' * (n - i - 1), end='')
    print('*' * (2 * i + 1))

```
/python/p03541.md
# p03541

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
