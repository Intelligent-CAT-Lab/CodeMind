
```
import math

a, b, cc = map(float, input().split())
cc = math.radians(cc)

s = a * b * math.sin(cc) / 2.0
l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
h = b * math.sin(cc)

print(s)
print(l)
print(h)
```

## 02381
Translate the following java code to python and enclose your solution inside ```python```:
```
public class p02381{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, c;
    int max;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    max = a;
    if (b > max) max = b;
    if (c > max) max = c;

    System.out.println(max);

    sc.close();
  }
  public static void main(String[] args){
    (new p02381()).run(System.in, System.out);
  }
}
```

python code:
```
a, b, c = map(int, input().split())

max = a
if b > max:
    max = b
if c > max:
    max = c

print(max)
```

## 02382
Translate the following java code to python and enclose your solution inside ```python```:
```
public class p02382{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, c;
    int min;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    min = a;
    if (b < min) min = b;
    if (c < min) min = c;

    System.out.println(min);

    sc.close();
  }
  public static void main(String[] args){
    (new p02382()).run(System.in, System.out);
  }
}
```

python code:
```
a, b, c = map(int, input().split())

min = a
if b < min:
    min = b
if c < min:
    min = c

print(min)
```

## 02383
Translate the following java code to python and enclose your solution inside ```python```:
```
public class p02383{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, c;
    int max, min;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    max = a;
    if (b > max) max = b;
    if (c > max) max = c;

    min = a;
    if (b < min) min = b;
    if (c < min) min = c;

    System.out.println(max - min);

    sc.close();
  }
  public static void main(String[] args){
    (new p02383()).run(System.in, System.out);
  }
}
```

python code:
```
a, b, c = map(int, input().split())

max = a
if b > max:
    max = b
if c > max:
    max = c

min = a
if b < min:
    min = b
if c < min:
    min = c

print(max - min)
```

## 02384
Translate the following java code to python and enclose your solution inside ```python```:
```
public class p02384{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, c;
    int max, min;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    max = a;
    if (b > max) max = b;
    if (c > max) max = c;

    min = a;
    if (b < min) min = b;
    if (c < min) min = c;

    System.out.println(max);
    System.out.println(min);

    sc.close();
  }
  public static void main(String[] args){
    (new p02384()).run(System.in, System.out);
  }
}
```

python code:
```
a, b, c = map(int, input().split())

max = a
if b > max:
    max = b
if c > max:
    max = c

min = a
if b < min:
    min = b
if c < min:
    min = c

print(max)
print(min)
```

## 02385
Translate the following java code to python and enclose your solution inside ```python```:
```
public class p02385{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, c;
    int max, min;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    max = a;
    if (b > max) max = b;
    if (c > max) max = c;

    min = a;
    if (b < min) min = b;
    if (c < min) min = c;

    System.out.println(max);
    System.out.println(min);
    System.out.println(a + b + c - max - min);

    sc.close();
  }
  public static void main(String[] args){
    (new p02385()).run(System.in, System.out);
  }
}
```

python code:
```
a, b, c = map(int, input().split())

max = a
if b > max:
    max = b
if c > max:
    max = c

min = a
if b < min:
    min = b
if c < min:
    min = c

print(max)
print(min)
print(a + b + c - max - min)
```

## 02386
Translate the following java code to python and enclose your solution inside ```python```:
```
public class p02386{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, c;
    int max, min;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    max = a;
    if (b > max) max = b;
    if (c > max) max = c;

    min = a;
    if (b < min) min = b;
    if (c < min) min = c;

    System.out.println(max);
    System.out.println(min);
    System.out.println(a + b + c - max - min);
    System.out.println(a * b *
