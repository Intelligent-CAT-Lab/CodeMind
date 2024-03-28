
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String A = "CODEFESTIVAL2016";
        int cnt = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != S.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```

## 1.2.2. 1000

[A+B](https://atcoder.jp/contests/abc086/tasks/abc086_a)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a * b % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```

## 1.2.3. 1001

[Product](https://atcoder.jp/contests/abc081/tasks/abc081_a)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 1.2.4. 1002

[Placing Marbles](https://atcoder.jp/contests/abc081/tasks/abc081_a)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 1.2.5. 1003

[Shift only](https://atcoder.jp/contests/abc081/tasks/abc081_a)

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
        while (true) {
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    flag = false;
                }
                a[i] /= 2;
            }
            if (flag) {
                ans++;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}
```

## 1.2.6. 1004

[Some Sums](https://atcoder.jp/contests/abc083/tasks/abc083_b)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int tmp = i;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if (a <= sum && sum <= b) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 1.2.7. 1005

[Coins](https://atcoder.jp/contests/abc087/tasks/abc087_b)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int ans = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    if (500 * i + 100 * j + 50 * k == x) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 1.2.8. 1006

[Some Sums](https://atcoder.jp/contests/abc083/tasks/abc083_b)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int tmp = i;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if (a <= sum && sum <= b) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 1.2.9. 1007

[Kagami Mochi](https://atcoder.jp/contests/abc088/tasks/abc088_b)

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int alice = 0;
        int bob = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                alice += a[i];
            } else {
                bob += a[i];
            }
        }
        System.out.println(alice - bob);
    }
}
```

## 1.2.10. 1008

[Card Game for Two](https://atcoder.jp/contests/abc085/tasks/abc085_b)

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (d[i] != d[i - 1]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 1.2.11. 1009

[Otoshidama](https://atcoder.
