
```
import sys

h1, m1, h2, m2, k = map(int, sys.stdin.readline().split())
h = h2 - h1
m = m2 - m1
day = (h * 60) + m
print(day - k)
```

## 2. 10869

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = nextInt(scanner);
        int b = nextInt(scanner);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }
}
```

python code:
```
import sys

a, b = map(int, sys.stdin.readline().split())
print(a + b)
print(a - b)
print(a * b)
print(a // b)
print(a % b)
```

## 3. 10430

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = nextInt(scanner);
        int b = nextInt(scanner);
        int c = nextInt(scanner);
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }
}
```

python code:
```
import sys

a, b, c = map(int, sys.stdin.readline().split())
print((a + b) % c)
print(((a % c) + (b % c)) % c)
print((a * b) % c)
print(((a % c) * (b % c)) % c)
```

## 4. 2588

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = nextInt(scanner);
        int b = nextInt(scanner);
        System.out.println(a * (b % 10));
        System.out.println(a * (b / 10 % 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }
}
```

python code:
```
import sys

a, b = map(int, sys.stdin.readline().split())
print(a * (b % 10))
print(a * (b // 10 % 10))
print(a * (b // 100))
print(a * b)
```


## 2. 10869

## 3. 10430

## 4. 2588
/README.md
# python-java-translation

## 1. 2663

Translate the following java code to python
