
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> res = prime_factorize(n);
        if (res.size() == 1) {
            System.out.println(1);
        } else {
            int cnt = 0;
            Integer c = null;
            int p = 0;
            HashSet<Integer> l = new HashSet<Integer>();
            for (int r : res) {
                if (c == r) {
                    p += 1;
                    if (!l.contains(p)) {
                        l.add(p);
                        p = 0;
                        cnt += 1;
                    }
                } else {
                    l.clear();
                    p = 0;
                    l.add(1);
                    cnt += 1;
                    c = r;
                }
            }
            System.out.println(cnt);
        }
    }

    public static ArrayList<Integer> prime_factorize(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }
}
```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```:
```
def f(n):
    if n == 0:
        return 1
    if n == 1:
        return 2
    if n == 2:
        return 3
    return (f(n - 1) + f(n - 2) + f(n - 3)) % 1000000007

n = int(input())
print(f(n))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }

    public static int f(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        return (f(n - 1) + f(n - 2) + f(n - 3)) % 1000000007;
    }
}
```

## 11. 1000000007

Translate the following python code to java and enclose your solution inside ```java```:
```
def f(n):
    if n == 0:
        return 1
    if n == 1:
        return 2
    if n == 2:
        return 3
    return (f(n - 1) + f(n - 2) + f(n - 3)) % 1000000007

n = int(input())
print(f(n))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }

    public static int f(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        return (f(n - 1) + f(n - 2) + f(n - 3)) % 1000000007;
    }
}
```

## 12. 1000000007

Translate the following python code to java and enclose your solution inside ```java```:
```
def f(n):
    if n == 0:
        return 1
    if n == 1:
        return 2
    if n == 2:
        return 3
    return (f(n - 1) + f(n - 2) + f(n - 3)) % 1000000007

n = int(input())
print(f(n))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }

    public static int f(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        return (f(n - 1) + f(n - 2) + f(n - 3)) % 1000000007;
    }
}
```

## 13. 1000000007

Translate the following python code to java and enclose your solution inside ```java```:
```
def f(n):
    if n == 0:
        return 1
    if n == 1:
        return 2
    if n == 2:
        return 3
    return (f(n - 1) + f(n - 2) + f(n - 3)) % 1000000007

n = int(input())
print(f(n))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }

    public static int f(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        return (f(n - 1) + f(n - 2) + f(n - 3)) % 1000000007;
    }
}
```

## 14. 1000000007

Translate the following python code to java and enclose your solution inside ```java```:
```
def f(n):
    if n == 0:
        return 1
    if n == 1:
        return 2
    if n == 2:
        return 3
    return (f(n - 1) + f(n - 2) + f(n - 3)) % 1000000007

n = int(input())
print(f(n))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }

    public static int f(int n) {
        if (n == 0
