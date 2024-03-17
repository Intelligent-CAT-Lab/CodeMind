

```python
s = input()
s += '2'
n = len(s)
ans = n - 1
for i in range(n - 1):
    if s[i] != s[i + 1]:
        tmp = max(i + 1, n - i - 2)
        ans = min(ans, tmp)
print(ans)
```

## p03481

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5


```
import java.util.Scanner;

public class p03481 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }
    }

}

```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n):
    print(a[i], end=' ')
```

## p03482

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
5 4 3 2 1


```
import java.util.Scanner;

public class p03482 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for(int i = n - 1; i >= 0; --i) {
            System.out.print(a[i] + " ");
        }
    }

}

```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n - 1, -1, -1):
    print(a[i], end=' ')
```

## p03483

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5
5 4 3 2 1


```
import java.util.Scanner;

public class p03483 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = n - 1; i >= 0; --i) {
            System.out.print(a[i] + " ");
        }
    }

}

```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n):
    print(a[i], end=' ')
print()
for i in range(n - 1, -1, -1):
    print(a[i], end=' ')
```

## p03484

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5
5 4 3 2 1
1 2 3 4 5


```
import java.util.Scanner;

public class p03484 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = n - 1; i >= 0; --i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }
    }

}

```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n):
    print(a[i], end=' ')
print()
for i in range(n - 1, -1, -1):
    print(a[i], end=' ')
print()
for i in range(n):
    print(a[i], end=' ')
```

## p03485

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5
5 4 3 2 1
1 2 3 4 5
5 4 3 2 1


```
import java.util.Scanner;

public class p03485 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = n - 1; i >= 0; --i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = n - 1; i >= 0; --i) {
            System.out.print(a[i] + " ");
        }
    }

}

```

python code:

```python
n = int(input())
a = list
