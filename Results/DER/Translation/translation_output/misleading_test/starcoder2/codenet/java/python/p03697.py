
```python
a, b = map(int, input().split())
if a + b >= 10:
    print("error")
else:
    print(a + b)
```

## 3.6.10

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20 30

Expected output:
10

```
import java.util.*;
public class p03698 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else {
            if (b > c) {
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
    }
}
```

python code:
```python
a, b, c = map(int, input().split())
if a > b:
    if a > c:
        print(a)
    else:
        print(c)
else:
    if b > c:
        print(b)
    else:
        print(c)
```

## 3.6.11

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20 30

Expected output:
30

```
import java.util.*;
public class p03699 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b) {
            if (a < c) {
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else {
            if (b < c) {
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
    }
}
```

python code:
```python
a, b, c = map(int, input().split())
if a < b:
    if a < c:
        print(a)
    else:
        print(c)
else:
    if b < c:
        print(b)
    else:
        print(c)
```


## 3.6.1

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10

```
import java.util.*;
public class p03691 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
    }
}
```

python code:
```python
a = int(input())
print(a)
```

## 3.6.2

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20

Expected output:
30

```
import java.util.*;
public class p03692 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

python code:
```python
a, b = map(int, input().split())
print(a + b)
```

## 3.6.3

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20

Expected output:
10

```
import java.util.*;
public class p03693 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
    }
}
```

python code:
```python
a, b = map(int, input().split())
print(a - b)
```

## 3.6.4

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20

Expected output:
200

```
import java.util.*;
public class p03694 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }
}
```

python code:
```python
a, b = map(int, input().split())
print(a * b)
```

## 3.6.5

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20

Expected output:
0

```
import java.util.*;
public class p03695 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / b);
    }
}
```

python code:
```python
a, b = map(int, input().split())
print(a // b)
```

## 3.6.6

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20

Expected output:
10

```
import java.util.*;
public class p03696 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a % b);
    }
}
```

python code:
```python
a, b = map(int, input().split())
print(a % b)
```

## 3.6.7

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20

Expected output:
30

```
import java.util.*;
public class p03697 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

python code:
```python
a, b = map(int, input().split())
print(a + b)
```

## 3.6.8

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20

Expected output:
-10

```
import java.util.*;
public class p03698 {
    public static void main(String[] args){
        Scanner sc = new Scanner(
