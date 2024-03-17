

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int n2 = N * 1;
        int n1 = N * 1;
        int m1 = M * 1;
        int mall = M * 2;
        int ans1 = 0;
        while (true) {
            mall -= n1;
            m1 = -(-mall / 2);
            if (mall <= 0) {
                break;
            }
            ans1 += 1;
            if (n2 - m1 >= 0) {
                n2 -= m1;
            } else {
                n1 = n1 + n2 - m1;
                n2 = 0;
            }
            if (n1 <= 0) {
                break;
            }
            ans1 += 1;
        }
        int ans2 = 0;
        n2 = N * 1;
        n1 = N * 1;
        m1 = M * 1;
        m2 = M * 1;
        mall = M * 2;
        int nall = N * 2;
        while (true) {
            if (m2 - n1 >= 0) {
                m2 -= n1;
            } else {
                m1 = m1 + m2 - n1;
                m2 = 0;
            }
            if (m1 <= 0) {
                break;
            }
            ans2 += 1;
            nall -= m1;
            n1 = -(-nall / 2);
            if (nall <= 0) {
                break;
            }
            ans2 += 1;
        }
        System.out.println(Math.min(ans1, ans2));
    }
}
```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def inpl(): return list(map(int, input().split()))

N = int(input())

print(N-1)

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N - 1);
    }
}
```

## 11. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def inpl(): return list(map(int, input().split()))

N = int(input())

print(N-1)

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N - 1);
    }
}
```

## 12. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def inpl(): return list(map(int, input().split()))

N = int(input())

print(N-1)

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N - 1);
    }
}
```

## 13. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def inpl(): return list(map(int, input().split()))

N = int(input())

print(N-1)

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N - 1);
    }
}
```

## 14. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def inpl(): return list(map(int, input().split()))

N = int(input())

print(N-1)

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N - 1);
    }
}
```

## 15. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def inpl(): return list(map(int, input().split()))

N = int(input())

print(N-1)

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N - 1);
    }
}
```

## 16. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def inpl(): return
