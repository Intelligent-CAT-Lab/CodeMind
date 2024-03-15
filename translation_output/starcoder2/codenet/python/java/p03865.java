
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() % 2 == 1) {
                ans = "Second";
            } else {
                ans = "First";
            }
        } else {
            if (s.length() % 2 == 1) {
                ans = "First";
            } else {
                ans = "Second";
            }
        }
        System.out.println(ans);
    }
}
```
/2019-2020/2019-2020-1/2019-2020-1-1.md
# 2019-2020-1-1

## 1.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = [int(input()) for i in range(n)]
  }
        System.out.println(ans);
    }
}
```
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = [int(input()) for i in range(n)]
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 3.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = [int(input()) for i in range(n)]
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 4.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = [int(input()) for i in range(n)]
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 5.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = [int(input()) for i in range(n)]
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 6.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = [int(input()) for i in range(n)]
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 7.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = [int(input()) for i in range(n)]
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

java code:
```java
import java.
