
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = (int) ((-1 + Math.sqrt(1 + 8 * x)) / 2);
        if (t * (t + 1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t + 1);
        }
    }
}
```

## ABC057-C

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1

```
#ABC057-C
n = int(input())

#2æ¬¡æ¹ç¨å¼ãè§£ã
ans = 10**10
for i in range(1, int(n**0.5)+1):
    if n % i == 0:
        ans = min(ans, max(len(str(i)), len(str(n//i))))
print(ans)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 10000000000L;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ans = Math.min(ans, Math.max(String.valueOf(i).length(), String.valueOf(n / i).length()));
            }
        }
        System.out.println(ans);
    }
}
```

## ABC058-C

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3
ac
ab
aa

Expected output:
a

```
#ABC058-C
n = int(input())
s = [input() for _ in range(n)]

#2æ¬¡æ¹ç¨å¼ãè§£ã
ans = [10**10 for _ in range(26)]
for i in range(n):
    for j in range(26):
        ans[j] = min(ans[j], s[i].count(chr(ord('a')+j)))
print(''.join([chr(ord('a')+i) for i in range(26) if ans[i] != 10**10]))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        int[] ans = new int[26];
        for (int i = 0; i < 26; i++) {
            ans[i] = 1000000000;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 26; j++) {
                ans[j] = Math.min(ans[j], count(s[i], (char) (j + 'a')));
            }
        }
        for (int i = 0; i < 26; i++) {
            if (ans[i] != 1000000000) {
                System.out.print((char) (i + 'a'));
            }
        }
        System.out.println();
    }

    public static int count(String s, char c) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cnt++;
            }
        }
        return cnt;
    }
}
```

## ABC059-C

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3
1 2 3

Expected output:
3

```
#ABC059-C
n = int(input())
a = list(map(int, input().split()))

#2æ¬¡æ¹ç¨å¼ãè§£ã
ans = 0
s = 0
for i in range(n):
    s += a[i]
    if i % 2 == 0:
        if s <= 0:
            ans += 1-s
            s = 1
    else:
        if s >= 0:
            ans += 1+s
            s = -1
print(ans)

ans = 0
s = 0
for i in range(n):
    s += a[i]
    if i % 2 == 1:
        if s <= 0:
            ans += 1-s
            s = 1
    else:
        if s >= 0:
            ans += 1+s
            s = -1
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
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += a[i];
            if (i % 2 == 0) {
                if (s <= 0) {
                    ans += 1 - s;
                    s = 1;
                }
            } else {
                if (s >= 0) {
                    ans += 1 + s;
                    s = -1;
                }
            }
        }
        System.out.println(ans);
        ans = 0;
        s = 0;
        for (int i = 0; i < n; i++) {
            s += a[i];
            if (i % 2 == 1) {
                if (s <= 0) {
                    ans += 1 - s;
                    s = 1;
                }
            } else {
                if (s >= 0) {
                    ans += 1 + s;
                    s = -1;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## ABC060-C

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 10
1 2 3

Expected output:
10

```
#ABC060-C
n, t = map(int, input().split())
a = list(map(int, input().split()))

#2æ¬¡æ¹ç¨å¼ãè§£ã
ans = 0
for i in range(n-1):
    ans += min(t, a[i+1]-a[i])
print(ans+t)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a =
