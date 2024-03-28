

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int root = (int) Math.sqrt(n) + 1;
        boolean[] isPrime = new boolean[n + 3];
        for (int i = 4; i < n + 3; i += 2) {
            isPrime[i] = false;
        }
        int ans = 0;
        int prePrime = -1;
        for (int i = 3; i < n + 3; i += 2) {
            if (isPrime[i]) {
                if (prePrime + 2 == i) {
                    ans += 2;
                }
                prePrime = i;
                if (i > root) {
                    continue;
                }
                for (int j = i * i; j < n + 3; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2. 1001

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
1000


```
def main():
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        ans += i
    print(ans)

main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}
```

## 3. 1002

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
1000


```
def main():
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        ans += i
    print(ans)

main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}
```

## 4. 1003

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
1000


```
def main():
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        ans += i
    print(ans)

main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}
```

## 5. 1004

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
1000


```
def main():
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        ans += i
    print(ans)

main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}
```

## 6. 1005

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
1000


```
def main():
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        ans += i
    print(ans)

main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}
```

## 7. 1006

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
1000


```
def main():
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        ans += i
    print(ans)

main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}
```

## 8. 1007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
1000


```
def main():
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        ans += i
    print(ans)

main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}
```

## 9. 1008

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
1000


```
def main():
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        ans += i
    print(ans)

main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System
