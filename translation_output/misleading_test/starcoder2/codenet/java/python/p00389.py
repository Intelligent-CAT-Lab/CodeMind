

```python
import sys

def main():
    base, K = map(int, sys.stdin.readline().split())
    next = 0
    ans = 1
    while base >= 1:
        low = 0
        high = base
        while high - low > 1:
            willNext = (low + high) // 2
            if willNext <= K * (base - willNext):
                low = willNext
            else:
                high = willNext
        next = low

        if next > 0:
            base = next
            ans += 1
        else:
            break
    print(ans)

if __name__ == '__main__':
    main()
```

## p00390

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

public class p00390 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long ans = 0;
        while (a > 0 && b > 0) {
            if (a > b) {
                long tmp = a;
                a = b;
                b = tmp;
            }
            ans += a;
            a -= 1;
            b -= 2;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    ans = 0
    while a > 0 and b > 0:
        if a > b:
            a, b = b, a
        ans += a
        a -= 1
        b -= 2
    print(ans)

if __name__ == '__main__':
    main()
```

## p00391

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

public class p00391 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long ans = 0;
        while (a > 0 && b > 0) {
            if (a > b) {
                long tmp = a;
                a = b;
                b = tmp;
            }
            ans += a;
            a -= 1;
            b -= 2;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    ans = 0
    while a > 0 and b > 0:
        if a > b:
            a, b = b, a
        ans += a
        a -= 1
        b -= 2
    print(ans)

if __name__ == '__main__':
    main()
```

## p00392

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

public class p00392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long ans = 0;
        while (a > 0 && b > 0) {
            if (a > b) {
                long tmp = a;
                a = b;
                b = tmp;
            }
            ans += a;
            a -= 1;
            b -= 2;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    ans = 0
    while a > 0 and b > 0:
        if a > b:
            a, b = b, a
        ans += a
        a -= 1
        b -= 2
    print(ans)

if __name__ == '__main__':
    main()
```

## p00393

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

public class p00393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long ans = 0;
        while (a > 0 && b > 0) {
            if (a > b) {
                long tmp = a;
                a = b;
                b = tmp;
            }
            ans += a;
            a -= 1;
            b -= 2;
        }
        System.out.println(ans);
    }
}

```

python code:

```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    ans = 0
    while a > 0 and b > 0:
        if a > b:
            a, b = b, a
        ans += a
        a -= 1
        b -= 2
    print(ans)

if __name__ == '__main__':
    main()
```

## p00394

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

public class p00394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long ans = 0;
        while (a > 0 && b > 0) {
            if (a > b) {
                long tmp = a;
                a = b;
                b = tmp;
            }
            ans += a;
            a -= 1;
            b -= 2;
        }
        System.out.println(ans);
    }
}

```

python code:

```
