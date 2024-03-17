

```python
a, b = map(int, input().split())
if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
    print("Possible")
else:
    print("Impossible")
```

## 3.6.5. 10039 - 평균 점수

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100
90

Expected output:
95


```
import java.util.Scanner;

public class p10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < 40) a = 40;
        if(b < 40) b = 40;
        System.out.println((a + b) / 2);
    }
}
```

python code:

```python
a, b = map(int, input().split())
if a < 40:
    a = 40
if b < 40:
    b = 40
print((a + b) // 2)
```

## 3.6.6. 10817 - 세 수

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
2


```
import java.util.Scanner;

public class p10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b) {
            if(b > c) System.out.println(b);
            else if(a > c) System.out.println(c);
            else System.out.println(a);
        } else {
            if(a > c) System.out.println(a);
            else if(b > c) System.out.println(c);
            else System.out.println(b);
        }
    }
}
```

python code:

```python
a, b, c = map(int, input().split())
if a > b:
    if b > c:
        print(b)
    elif a > c:
        print(c)
    else:
        print(a)
else:
    if a > c:
        print(a)
    elif b > c:
        print(c)
    else:
        print(b)
```

## 3.6.7. 2753 - 윤년

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2000

Expected output:
1


```
import java.util.Scanner;

public class p2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0) System.out.println(1);
        else System.out.println(0);
    }
}
```

python code:

```python
a = int(input())
if a % 4 == 0 and a % 100 != 0 or a % 400 == 0:
    print(1)
else:
    print(0)
```

## 3.6.8. 2884 - 알람 시계

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 45

Expected output:
0 45


```
import java.util.Scanner;

public class p2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b >= 45) System.out.println(a + " " + (b - 45));
        else System.out.println((a - 1) + " " + (b + 15));
    }
}
```

python code:

```python
a, b = map(int, input().split())
if b >= 45:
    print(a, b - 45)
else:
    print(a - 1, b + 15)
```

## 3.6.9. 5543 - 상근날드

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
800
700
900
198
330

Expected output:
848


```
import java.util.Scanner;

public class p5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int min = Math.min(a, b);
        min = Math.min(min, c);
        int min2 = Math.min(d, e);
        System.out.println(min + min2 - 50);
    }
}
```

python code:

```python
a, b, c, d, e = map(int, input().split())
min = min(a, b, c)
min2 = min(d, e)
print(min + min2 - 50)
```

## 3.6.10. 10871 - X보다 작은 수

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 5
1 10 4 9 2 3 8 5 7 6

Expected output:
1 4 2 3 
```

```
import java.util.Scanner;

public class p10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a < x) System.out.print(a + " ");
        }
    }
}
```

python code:

```python
n, x = map(int, input().split())
a = list(map(int, input().split()))
for i in range(n):
    if a[i] < x:
        print(a[i], end=' ')
```

## 3.6.11. 10950 - A+B - 3

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
1 1
2 3
3 4
9 8
5 2

Expected output:
2
5
7
17
7
```

```
import java.util.Scanner;

public class p10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
```

python code:

```
