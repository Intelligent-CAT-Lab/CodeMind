

```python
import math
d = float(input())
if d < 1:
    print(d * math.sqrt(2))
elif d < math.sqrt(2):
    print(2)
elif d < 2:
    print(d * math.sqrt(2))
elif d < math.sqrt(2) * 1.5:
    print(3)
else:
    print(d * math.sqrt(2))
```

## 1742

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10


```
public class p01742{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] a = new int[10];
    for(int i = 0; i < 10; i++)a[i] = sc.nextInt();
    for(int i = 0; i < 10; i++)out.print(a[i] + " ");
    out.println();
    sc.close();
  }
  public static void main(String[] args){
    (new p01742()).run(System.in, System.out);
  }
}
```

python code:

```python
a = list(map(int, input().split()))
for i in range(10):
    print(a[i], end=' ')
print()
```

## 1743

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10 9 8 7 6 5 4 3 2 1


```
public class p01743{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] a = new int[10];
    for(int i = 0; i < 10; i++)a[i] = sc.nextInt();
    for(int i = 9; i >= 0; i--)out.print(a[i] + " ");
    out.println();
    sc.close();
  }
  public static void main(String[] args){
    (new p01743()).run(System.in, System.out);
  }
}
```

python code:

```python
a = list(map(int, input().split()))
for i in range(9, -1, -1):
    print(a[i], end=' ')
print()
```

## 1744

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 3 5 7 9 10 8 6 4 2


```
public class p01744{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] a = new int[10];
    for(int i = 0; i < 10; i++)a[i] = sc.nextInt();
    for(int i = 0; i < 10; i += 2)out.print(a[i] + " ");
    for(int i = 9; i >= 0; i -= 2)out.print(a[i] + " ");
    out.println();
    sc.close();
  }
  public static void main(String[] args){
    (new p01744()).run(System.in, System.out);
  }
}
```

python code:

```python
a = list(map(int, input().split()))
for i in range(0, 10, 2):
    print(a[i], end=' ')
for i in range(9, -1, -2):
    print(a[i], end=' ')
print()
```

## 1745

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1


```
public class p01745{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] a = new int[10];
    for(int i = 0; i < 10; i++)a[i] = sc.nextInt();
    for(int i = 0; i < 10; i++)out.print(a[i] + " ");
    out.println();
    for(int i = 9; i >= 0; i--)out.print(a[i] + " ");
    out.println();
    sc.close();
  }
  public static void main(String[] args){
    (new p01745()).run(System.in, System.out);
  }
}
```

python code:

```python
a = list(map(int, input().split()))
for i in range(10):
    print(a[i], end=' ')
print()
for i in range(9, -1, -1):
    print(a[i], end=' ')
print()
```

## 1746

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1
1 3 5 7 9 10 8 6 4 2


```
public class p01746{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] a = new int[10];
    for(int i = 0; i < 10; i++)a[i] = sc.nextInt();
    for(int i = 0; i < 10; i++)out.print(a[i] + " ");
    out.println();
    for(int i = 9; i >= 0; i--)out.print(a[i] + " ");
    out.println();
    for(int i = 0; i < 10; i += 2)out.print(a[i] + " ");
    for(int i = 9; i >= 0; i -= 2)out.print(a[i] + "
