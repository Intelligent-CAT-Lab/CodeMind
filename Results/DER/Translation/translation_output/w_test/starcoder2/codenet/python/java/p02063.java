

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (B % A == 0) {
            System.out.println(-1);
            return;
        }
        int _k = -(-B / A);
        for (int k = _k; k < _k + 10000000; k++) {
            int bn = k * A / B;
            int rem = k * A % B;
            int an = rem / A;
            int n = bn + an + rem % A;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
        }
        System.out.println(-1);
    }
}
```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java
public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }
}
```


```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java
public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }
}
```
/2017-09-18.md
# 2017-09-18

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 6

Expected output:
8


```
A,B = map(int,input().split())

if B%A == 0:
    print(-1)
    exit()

_k = -(-B//A)

for k in range(_k, _k+10**7):
    bn, rem = divmod(k*A, B)
    an, rem = divmod(rem, A)
    n = bn + an + rem
    if n > k:
        print(k*A)
        exit()
print(-1)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (B % A == 0) {
            System.out.println(-1);
            return;
        }
        int _k = -(-B / A);
        for (int k = _k; k < _k + 10000000; k++) {
            int bn = k * A / B;
            int rem = k * A % B;
            int an = rem / A;
            int n = bn + an + rem % A;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
        }
        System.out.println(-1);
    }
}
```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java
public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }
}
```

# 2017-09-18

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 6

Expected output:
8


```
A,B = map(int,input().split())

if B%A == 0:
    print(-1)
    exit()

_k = -(-B//A)

for k in range(_k, _k+10**7):
    bn, rem = divmod(k*A, B)
    an, rem = divmod(rem, A)
    n = bn + an + rem
    if n > k:
        print(k*A)
        exit()
print(-1)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (B % A == 0) {
            System.out.println(-1);
            return;
        }
        int _k = -(-B / A);
        for (int k = _k; k < _k + 10000000; k++) {
            int bn = k * A / B;
            int rem = k * A % B;
            int an = rem / A;
            int n = bn + an + rem % A;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
        }
        System.out.println(-1);
    }
}
```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java
public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }
}
```

# 2017-09-18

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 6

Expected output:
8


```
A,B = map(int,input().split())

if B%A == 0:
    print(-1)
    exit()

_k = -(-B//A)

for k in range(_k, _k+10**7):
    bn, rem = divmod(k*A, B)
    an, rem = divmod(rem, A)
    n = bn + an + rem
    if n > k:
        print(k*A)
        exit()
print(-1)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (B % A == 0) {
            System.out.println(-1);
            return;
        }
        int _k = -(-B / A);
        for (int k = _k; k < _k + 1000000
