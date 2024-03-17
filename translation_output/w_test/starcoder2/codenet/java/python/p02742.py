

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
3 4 5 12 9 16

Expected output:
21


```
import java.util.Scanner;

public class p1002 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();
        int r2 = scan.nextInt();
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        int d1 = scan.nextInt();
        int d2 = scan.nextInt();

        int a = (d1+r2-d2)/2;
        int b = (d1-r1+d2)/2;
        int c = (r1+r2-d1)/2;
        int e = (r1-r2+d1)/2;

        if(a == b && c == e) {
            System.out.println(a + " " + c);
        } else {
            System.out.println(-1);
        }
    }

}
```

python code:

```python
r1, r2, c1, c2, d1, d2 = map(int, input().split())
a = (d1+r2-d2)//2
b = (d1-r1+d2)//2
c = (r1+r2-d1)//2
e = (r1-r2+d1)//2
if a == b and c == e:
    print(a, c)
else:
    print(-1)
```

## 2.7.4.5. 1003

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6


```
import java.util.Scanner;

public class p1003 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a*b*c);
    }

}
```

python code:

```python
a, b, c = map(int, input().split())
print(a*b*c)
```

## 2.7.4.6. 1004

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
24


```
import java.util.Scanner;

public class p1004 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        System.out.println(a*b*c*d);
    }

}
```

python code:

```python
a, b, c, d = map(int, input().split())
print(a*b*c*d)
```

## 2.7.4.7. 1005

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
120


```
import java.util.Scanner;

public class p1005 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        System.out.println(a*b*c*d*e);
    }

}
```

python code:

```python
a, b, c, d, e = map(int, input().split())
print(a*b*c*d*e)
```

## 2.7.4.8. 1006

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6

Expected output:
720


```
import java.util.Scanner;

public class p1006 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();

        System.out.println(a*b*c*d*e*f);
    }

}
```

python code:

```python
a, b, c, d, e, f = map(int, input().split())
print(a*b*c*d*e*f)
```

## 2.7.4.9. 1007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7

Expected output:
5040


```
import java.util.Scanner;

public class p1007 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
    
