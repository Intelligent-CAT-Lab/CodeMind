

```python
w, h = map(int, input().split())
if w == 1 or h == 1:
    print(1)
else:
    c = (w*h)//2 + (w*h)%2
    print(c)
```

## 2.7.4.2. 1000

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
3

```
import java.util.Scanner;

public class p1000 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a+b);
    }

}
```

python code:

```python
a, b = map(int, input().split())
print(a+b)
```

## 2.7.4.3. 1001

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1

```
import java.util.Scanner;

public class p1001 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a-b);
    }

}
```

python code:

```python
a, b = map(int, input().split())
print(a-b)
```

## 2.7.4.4. 1002

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4 5 12 5 16

Expected output:
8.0000000000

```
import java.util.Scanner;

public class p1002 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double r1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double r2 = scan.nextDouble();

        double d = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        if(d == 0) {
            if(r1 == r2) {
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        } else {
            if(d > r1+r2) {
                System.out.println(d-r1-r2);
            } else if(d == r1+r2) {
                System.out.println(0);
            } else if(d < r1+r2) {
                if(d+Math.min(r1, r2) == Math.max(r1, r2)) {
                    System.out.println(0);
                } else {
                    System.out.println(Math.max(r1, r2) - (d+Math.min(r1, r2)));
                }
            }
        }
    }

}
```

python code:

```python
import math
x1, y1, r1, x2, y2, r2 = map(float, input().split())
d = math.sqrt((x1-x2)**2 + (y1-y2)**2)
if d == 0:
    if r1 == r2:
        print(-1)
    else:
        print(0)
else:
    if d > r1+r2:
        print(d-r1-r2)
    elif d == r1+r2:
        print(0)
    elif d < r1+r2:
        if d+min(r1, r2) == max(r1, r2):
            print(0)
        else:
            print(max(r1, r2) - (d+min(r1, r2)))
```

## 2.7.4.5. 1003

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1 2

```
import java.util.Scanner;

public class p1003 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(b + " " + a);
    }

}
```

python code:

```python
a, b = map(int, input().split())
print(b, a)
```

## 2.7.4.6. 1008

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
0.5000000000

```
import java.util.Scanner;

public class p1008 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a/(double)b);
    }

}
```

python code:

```python
a, b = map(int, input().split())
print(a/b)
```

## 2.7.4.7. 1017

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000

Expected output:
1000000 0

```
import java.util.Scanner;

public class p1017 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(n/3 + " " + n%3);
    }

}
```

python code:

```python
n = int(input())
print(n//3, n%3)
```

## 2.7.4.8. 1018

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2014 11 20

Expected output:
2014-11-20

```
import java.util.Scanner;

public class p1018 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();

        System.out.println(y + "-" + m + "-" + d);
    }

}
```

python code:

```python
y, m, d = map(int, input().split())
print(y, m, d, sep="-")
```

## 2.7.4.9. 1025

Translate the following java code to python and enclose your solution inside ```python```
