

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();
        int t = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int ans = 0;
        for (int a : new int[]{p, 2*w-p}) {
            for (int b : new int[]{q, 2*h-q}) {
                ans += count(a, b, w, h, v, t, x, y);
            }
        }
        System.out.println(ans);
    }

    static int count(int a, int b, int w, int h, int v, int t, int x, int y) {
        int res = 0;
        int C = v*t;
        int ky = 0;
        while (true) {
            int B = b + 2*h*ky;
            int D = C*C - (B - y)*(B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int)((x - a - SQ) / (2*w));
            int k1 = (int)((x - a + SQ) / (2*w));
            res += Math.max(k1 - k0, 0);
            ky += 1;
        }
        ky = -1;
        while (true) {
            int B = b + 2*h*ky;
            int D = C*C - (B - y)*(B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int)((x - a - SQ) / (2*w));
            int k1 = (int)((x - a + SQ) / (2*w));
            res += Math.max(k1 - k0, 0);
            ky -= 1;
        }
        return res;
    }
}
```

## 2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def solve():
    n = int(input())
    print(n-1)
solve()

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n-1);
    }
}
```

## 3. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def solve():
    n = int(input())
    print(n-1)
solve()

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n-1);
    }
}
```

## 4. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def solve():
    n = int(input())
    print(n-1)
solve()

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n-1);
    }
}
```

## 5. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def solve():
    n = int(input())
    print(n-1)
solve()

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n-1);
    }
}
```

## 6. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def solve():
    n = int(input())
    print(n-1)
solve()

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n-1);
    }
}
```

## 7. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def solve():
    n = int(input())
    print(n-1)
solve()

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n-1);
    }
}
```

## 8. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
def solve():
    n = int(input())
