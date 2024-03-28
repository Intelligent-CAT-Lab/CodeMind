

```python
import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    for i in range(B+1, 1000000000000000000):
        ca = i // A + i % A
        remb = i % B
        cb = i // B + remb // A + remb % A
        if ca < cb:
            print(i)
            return
    print(-1)

if __name__ == '__main__':
    main()
```

## 02064

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

public class p02064 {
    static long startTime = System.currentTimeMillis();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long N = sc.nextLong();
        for (long i = 1; ; i++) {
            if ((i & 0xFF) == 0 && System.currentTimeMillis() - startTime > 3500) break;
            long ca = i / N + i % N;
            long cb = i / N + i % N;
            if (ca < cb) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

}


```

python code:

```python
import sys

def main():
    N = int(sys.stdin.readline())
    for i in range(1, 1000000000000000000):
        ca = i // N + i % N
        cb = i // N + i % N
        if ca < cb:
            print(i)
            return
    print(-1)

if __name__ == '__main__':
    main()
```

## 02065

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

public class p02065 {
    static long startTime = System.currentTimeMillis();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long N = sc.nextLong();
        for (long i = 1; ; i++) {
            if ((i & 0xFF) == 0 && System.currentTimeMillis() - startTime > 3500) break;
            long ca = i / N + i % N;
            long cb = i / N + i % N;
            if (ca < cb) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

}


```

python code:

```python
import sys

def main():
    N = int(sys.stdin.readline())
    for i in range(1, 1000000000000000000):
        ca = i // N + i % N
        cb = i // N + i % N
        if ca < cb:
            print(i)
            return
    print(-1)

if __name__ == '__main__':
    main()
```

## 02066

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

public class p02066 {
    static long startTime = System.currentTimeMillis();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long N = sc.nextLong();
        for (long i = 1; ; i++) {
            if ((i & 0xFF) == 0 && System.currentTimeMillis() - startTime > 3500) break;
            long ca = i / N + i % N;
            long cb = i / N + i % N;
            if (ca < cb) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

}


```

python code:

```python
import sys

def main():
    N = int(sys.stdin.readline())
    for i in range(1, 1000000000000000000):
        ca = i // N + i % N
        cb = i // N + i % N
        if ca < cb:
            print(i)
            return
    print(-1)

if __name__ == '__main__':
    main()
```

## 02067

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

public class p02067 {
    static long startTime = System.currentTimeMillis();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long N = sc.nextLong();
        for (long i = 1; ; i++) {
            if ((i & 0xFF) == 0 && System.currentTimeMillis() - startTime > 3500) break;
            long ca = i / N + i % N;
            long cb = i / N + i % N;
            if (ca < cb) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

}


```

python code:

```python
import sys

def main():
    N = int(sys.stdin.readline())
    for i in range(1, 1000000000000000000):
        ca = i // N + i % N
        cb = i // N + i % N
        if ca < cb:
            print(i)
            return
    print(-1)

if __name__ == '__main__':
    main()
```

## 02068

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

public class p02068 {
    static long startTime = System.currentTimeMillis();
    static Scanner sc = new Scanner(System.in);

    public static
