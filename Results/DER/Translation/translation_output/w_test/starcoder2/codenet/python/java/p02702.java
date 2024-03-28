

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] remain = new int[2020];
        int now = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += (s.charAt(i) - '0') * Math.pow(10, s.length() - i - 1, 2019);
            ans += remain[(int) (now % 2019)];
            remain[(int) (now % 2019)]++;
        }
        ans += remain[0];
        System.out.println(ans);
    }
}
```


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
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] > a[k] && a[i] + a[k] > a[j] && a[j] + a[k] > a[i]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
/2020/01/20200120.md
# 20200120

## 1. 1000

### 1.1. 题目

[1000](https://www.luogu.com.cn/problem/P1000)

### 1.2. 题解

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 2. 1001

### 2.1. 题目

[1001](https://www.luogu.com.cn/problem/P1001)

### 2.2. 题解

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 3. 1002

### 3.1. 题目

[1002](https://www.luogu.com.cn/problem/P1002)

### 3.2. 题解

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 4. 1003

### 4.1. 题目

[1003](https://www.luogu.com.cn/problem/P1003)

### 4.2. 题解

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 5. 1004

### 5.1. 题目

[1004](https://www.luogu.com.cn/problem/P1004)

### 5.2. 题解

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 6. 1005

### 6.1. 题目

[1005](https://www.luogu.com.cn/problem/P1005)

### 6.2. 题解

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 7. 1006

### 7.1. 题目

[1006](https://www.luogu.com.cn/problem/P1006)

### 7.2. 题解

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 8. 1007

### 8.1. 题目

[1007](https://www.luogu.com.cn/problem/P1007)

### 8.2. 题解

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 9. 1008

### 9.1. 题目

[1008](https://www.luogu.com.cn/problem/P1008)

### 9.2. 题解

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 10. 1009

### 10.1. 题目

[1009](https://www.luogu.com.cn/problem/P1009)

### 10.2. 题解

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 11. 1010

### 11.1. 题目

[1010](https://www.luogu.com.cn/problem/P1010)

### 11.2. 题解

```
import java.util.Scanner;

public class Main {
    public static void
