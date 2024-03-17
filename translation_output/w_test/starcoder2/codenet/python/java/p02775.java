

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int[] n_arr = new int[n.length() + 1];
        for (int i = 0; i < n.length(); i++) {
            n_arr[i] = Integer.parseInt(String.valueOf(n.charAt(n.length() - i - 1)));
        }
        int s = 0;
        int res = 0;
        for (int i = 0; i < n_arr.length - 1; i++) {
            int k = n_arr[i] + s;
            if (k < 5 || (k == 5 && n_arr[i + 1] < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);
    }
}
```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
# https://atcoder.jp/contests/abc155/submissions/10175015

def main():
    n = list(map(int, input()[::-1])) + [0]
    s = 0
    res = 0
    for i, ni in enumerate(n[:-1]):
        k = ni + s
        if k < 5 or (k == 5 and int(n[i + 1]) < 5):
            res += k
            s = 0
        else:
            res += 10 - k
            s = 1
    res += s
    print(res)


if __name__ == '__main__':
    main()
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int[] n_arr = new int[n.length() + 1];
        for (int i = 0; i < n.length(); i++) {
            n_arr[i] = Integer.parseInt(String.valueOf(n.charAt(n.length() - i - 1)));
        }
        int s = 0;
        int res = 0;
        for (int i = 0; i < n_arr.length - 1; i++) {
            int k = n_arr[i] + s;
            if (k < 5 || (k == 5 && n_arr[i + 1] < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);
    }
}
```

## 11. 1000000008

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000008

Expected output:
1000000008


```
# https://atcoder.jp/contests/abc155/submissions/10175015

def main():
    n = list(map(int, input()[::-1])) + [0]
    s = 0
    res = 0
    for i, ni in enumerate(n[:-1]):
        k = ni + s
        if k < 5 or (k == 5 and int(n[i + 1]) < 5):
            res += k
            s = 0
        else:
            res += 10 - k
            s = 1
    res += s
    print(res)


if __name__ == '__main__':
    main()
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int[] n_arr = new int[n.length() + 1];
        for (int i = 0; i < n.length(); i++) {
            n_arr[i] = Integer.parseInt(String.valueOf(n.charAt(n.length() - i - 1)));
        }
        int s = 0;
        int res = 0;
        for (int i = 0; i < n_arr.length - 1; i++) {
            int k = n_arr[i] + s;
            if (k < 5 || (k == 5 && n_arr[i + 1] < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);
    }
}
```

## 12. 1000000009

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000009

Expected output:
1000000009


```
# https://atcoder.jp/contests/abc155/submissions/10175015

def main():
    n = list(map(int, input()[::-1])) + [0]
    s = 0
    res = 0
    for i, ni in enumerate(n[:-1]):
        k = ni + s
        if k < 5 or (k == 5 and int(n[i + 1]) < 5):
            res += k
            s = 0
        else:
            res += 10 - k
            s = 1
    res += s
    print(res)


if __name__ == '__main__':
    main()
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int[] n_arr = new int[n.length() + 1];
        for (int i = 0; i < n.length(); i++) {
            n_arr[i] = Integer.parseInt(String.valueOf(n.charAt(n.length() - i - 1)));
        }
        int s = 0;
        int res = 0;
        for (int i = 0; i < n_arr.length - 1; i++) {
            int k = n_arr[i] + s;
            if (k < 5 || (k == 5 && n_arr[i + 1] < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);
    }
}
```

## 13. 1000000010

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000010

Expected output:
1000000010


```
# https://atcoder.jp/contests/abc155/submissions/10175015

def main():
    n = list(map(int, input()[::-1])) + [0]
    s =
