

```python
N = int(input())
if N == 1:
    print(1)
    print(0)
elif N == 2:
    print(2)
    print(0)
    print(11)
else:
    print(N-1)
    for i in range(2, N+1):
        s = '1' * i
        s = s[:1] + '0' + s[1:]
        s = s[:i-1] + '0' + s[i-1:]
        print(s)
```

## 2.2.23

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10
1
2
3
4
5
6
7
8
9
10

```
import java.util.Scanner;

public class p02224 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }

}

```

python code:

```python
N = int(input())
for i in range(1, N+1):
    print(i)
```

## 2.2.24

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10
9
8
7
6
5
4
3
2
1

```
import java.util.Scanner;

public class p02225 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }

}

```

python code:

```python
N = int(input())
for i in range(N, 0, -1):
    print(i)
```

## 2.2.25

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10
9
8
7
6
5
4
3
2
1
10
9
8
7
6
5
4
3
2
1

```
import java.util.Scanner;

public class p02226 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }

}

```

python code:

```python
N = int(input())
for i in range(N, 0, -1):
    print(i)
for i in range(N, 0, -1):
    print(i)
```

## 2.2.26

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10
9
8
7
6
5
4
3
2
1
1
2
3
4
5
6
7
8
9
10

```
import java.util.Scanner;

public class p02227 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }

}

```

python code:

```python
N = int(input())
for i in range(N, 0, -1):
    print(i)
for i in range(1, N+1):
    print(i)
```

## 2.2.27

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10
9
8
7
6
5
4
3
2
1
10
9
8
7
6
5
4
3
2
1
10
9
8
7
6
5
4
3
2
1

```
import java.util.Scanner;

public class p02228 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }

}

```

python code:

```python
N = int(input())
for i in range(N, 0, -1):
    print(i)
for i in range(N, 0, -1):
    print(i)
for i in range(N, 0, -1):
    print(i)
```

## 2.2.28

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10
9
8
7
6
5
4
3
2
1
1
2
3
4
5
6
7
8
9
10
1
2
3
4
5
6
7
8
9
10

```
import java.util.Scanner;

public class p02229 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }

}

```

python code:

```python
N = int(input())
for i in range(N, 0, -1):
    print(i)
for i in range(1, N+1):
    print(i)
for i in range(1
