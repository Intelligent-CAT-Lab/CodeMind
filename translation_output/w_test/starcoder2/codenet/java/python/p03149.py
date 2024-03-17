

```python
import sys

N = list(map(int, sys.stdin.readline().split()))
N.sort()
if N == [1, 4, 7, 9]:
    print("YES")
else:
    print("NO")
```

## p03150

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10


```
import java.util.Scanner;

public class p03150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[10];
        for (int i = 0; i < 10; i++) {
            N[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            ans += N[i];
        }
        System.out.println(ans);
    }
}

```

python code:

```python
import sys

N = list(map(int, sys.stdin.readline().split()))
print(sum(N))
```

## p03151

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
55


```
import java.util.Scanner;

public class p03151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[10];
        for (int i = 0; i < 10; i++) {
            N[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            ans += N[i] * N[i];
        }
        System.out.println(ans);
    }
}

```

python code:

```python
import sys

N = list(map(int, sys.stdin.readline().split()))
print(sum([x * x for x in N]))
```

## p03152

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
55


```
import java.util.Scanner;

public class p03152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[10];
        for (int i = 0; i < 10; i++) {
            N[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            ans += N[i] * N[i] * N[i];
        }
        System.out.println(ans);
    }
}

```

python code:

```python
import sys

N = list(map(int, sys.stdin.readline().split()))
print(sum([x * x * x for x in N]))
```

## p03153

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10


```
import java.util.Scanner;

public class p03153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[10];
        for (int i = 0; i < 10; i++) {
            N[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            if (N[i] % 2 == 0) {
                ans += N[i];
            }
        }
        System.out.println(ans);
    }
}

```

python code:

```python
import sys

N = list(map(int, sys.stdin.readline().split()))
print(sum([x for x in N if x % 2 == 0]))
```

## p03154

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30


```
import java.util.Scanner;

public class p03154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[10];
        for (int i = 0; i < 10; i++) {
            N[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            if (N[i] % 2 == 1) {
                ans += N[i];
            }
        }
        System.out.println(ans);
    }
}

```

python code:

```python
import sys

N = list(map(int, sys.stdin.readline().split()))
print(sum([x for x in N if x % 2 == 1]))
```

## p03155

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
55


```
import java.util.Scanner;

public class p03155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[10];
        for (int i = 0; i < 10; i++) {
            N[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            if (N[i] % 3 == 0) {
                ans += N[i];
            }
        }
        System.out.println(ans);
    }
}

```

python code:

```python
import sys

N = list(map(int, sys.stdin.readline().split()))
print(sum([x for x in N if x % 3 == 0]))
```

## p03156

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30


