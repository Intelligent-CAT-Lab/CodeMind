

```python
n = int(input())
a = [0] * 15
i = 0
while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1
while i > 0:
    i -= 1
    print((a[i] == 0 and '0' or a[i] > 0 and '+' or '-') + (i == 0 and '\n' or ''))
```

## 0307

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.Scanner;
// 0307
class p00301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[15],i=0;
        while(n>0) {
            a[i++]=(n+1)%3-1;
            n=(n-a[i-1])/3;
        }
        while(i-->0)
            System.out.print((a[i]==0?"0":a[i]>0?"+":"-")+(i==0?"\n":""));
    }
}

```

python code:

```python
n = int(input())
a = [0] * 15
i = 0
while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1
while i > 0:
    i -= 1
    print((a[i] == 0 and '0' or a[i] > 0 and '+' or '-') + (i == 0 and '\n' or ''))
```

## 0308

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.Scanner;
// 0308
class p00301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[15],i=0;
        while(n>0) {
            a[i++]=(n+1)%3-1;
            n=(n-a[i-1])/3;
        }
        while(i-->0)
            System.out.print((a[i]==0?"0":a[i]>0?"+":"-")+(i==0?"\n":""));
    }
}

```

python code:

```python
n = int(input())
a = [0] * 15
i = 0
while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1
while i > 0:
    i -= 1
    print((a[i] == 0 and '0' or a[i] > 0 and '+' or '-') + (i == 0 and '\n' or ''))
```
/01-python-basics/01-python-basics.md
# Python Basics

## 0101

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.Scanner;
// 0101
class p00101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
    }
}

```

python code:

```python
n = int(input())
print(n)
```

## 0102

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.Scanner;
// 0102
class p00101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
    }
}

```

python code:

```python
n = int(input())
print(n)
```

## 0103

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.Scanner;
// 0103
class p00101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
    }
}

```

python code:

```python
n = int(input())
print(n)
```

## 0104

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.Scanner;
// 0104
class p00101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
    }
}

```

python code:

```python
n = int(input())
print(n)
```

## 0105

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.Scanner;
// 0105
class p00101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
    }
}

```

python code:

```python
n = int(input())
print(n)
```

## 0106

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.Scanner;
// 0106
class p00101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
    }
}

```

python code:

```python
n = int(input())
print(n)
```

## 0107

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.Scanner;
// 0107
class p00101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
    }
}

