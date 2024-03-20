
```python
a, b = map(int, input().split())
count = 0
for i in range(a, b+1):
    array = [int(x) for x in str(i)]
    if array[0] == array[4] and array[1] == array[3]:
        count += 1
print(count)
```

## 3.4.17

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
101

```
import java.util.*;

class p03417 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for (int i = a; i <= b; i++) {
      int[] array = new int[5];
      array[0] = i % 10;
      array[1] = i / 10 % 10;
      array[2] = i / 100 % 10;
      array[3] = i / 1000 % 10;
      array[4] = i / 10000 % 10;
      if (array[0] == array[4] && array[1] == array[3]) {
        count++;
      }
    }
    System.out.println(count);
  }
}
```

python code:
```python
a, b = map(int, input().split())
count = 0
for i in range(a, b+1):
    array = [int(x) for x in str(i)]
    if array[0] == array[4] and array[1] == array[3]:
        count += 1
print(count)
```

## 3.4.18

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
101

```
import java.util.*;

class p03418 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for (int i = a; i <= b; i++) {
      int[] array = new int[5];
      array[0] = i % 10;
      array[1] = i / 10 % 10;
      array[2] = i / 100 % 10;
      array[3] = i / 1000 % 10;
      array[4] = i / 10000 % 10;
      if (array[0] == array[4] && array[1] == array[3]) {
        count++;
      }
    }
    System.out.println(count);
  }
}
```

python code:
```python
a, b = map(int, input().split())
count = 0
for i in range(a, b+1):
    array = [int(x) for x in str(i)]
    if array[0] == array[4] and array[1] == array[3]:
        count += 1
print(count)
```

## 3.4.19

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
101

```
import java.util.*;

class p03419 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for (int i = a; i <= b; i++) {
      int[] array = new int[5];
      array[0] = i % 10;
      array[1] = i / 10 % 10;
      array[2] = i / 100 % 10;
      array[3] = i / 1000 % 10;
      array[4] = i / 10000 % 10;
      if (array[0] == array[4] && array[1] == array[3]) {
        count++;
      }
    }
    System.out.println(count);
  }
}
```

python code:
```python
a, b = map(int, input().split())
count = 0
for i in range(a, b+1):
    array = [int(x) for x in str(i)]
    if array[0] == array[4] and array[1] == array[3]:
        count += 1
print(count)
```

## 3.4.20

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
101

```
import java.util.*;

class p03420 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for (int i = a; i <= b; i++) {
      int[] array = new int[5];
      array[0] = i % 10;
      array[1] = i / 10 % 10;
      array[2] = i / 100 % 10;
      array[3] = i / 1000 % 10;
      array[4] = i / 10000 % 10;
      if (array[0] == array[4] && array[1] == array[3]) {
        count++;
      }
    }
    System.out.println(count);
  }
}
```

python code:
```python
a, b = map(int, input().split())
count = 0
for i in range(a, b+1):
    array = [int(x) for x in str(i)]
    if array[0] == array[4] and array[1] == array[3]:
        count += 1
print(count)
```

## 3.4.21

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
101

```
import java.util.*;

class p03421 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for (int i = a; i <= b; i++) {
      int[] array = new int[5];
      array[0] = i % 10;
      array[1] = i / 10 % 10;
      array[2] = i / 100 % 10;
      array[3] = i / 1000 % 10;
      array[4] = i / 10
