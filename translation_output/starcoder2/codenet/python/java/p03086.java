
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T') {
                length++;
                ans = Math.max(ans, length);
            } else {
                length = 0;
            }
        }
        System.out.println(ans);
    }
}
```

## 1.2.2. 1000000007

### 1.2.2.1. 问题

给定一个整数$n$，求$n!$除以$1000000007$的余数。

### 1.2.2.2. 输入格式

一个整数$n$。

### 1.2.2.3. 输出格式

一个整数，表示$n!$除以$1000000007$的余数。

### 1.2.2.4. 数据范围

$1 \le n \le 1000000000$

### 1.2.2.5. 输入样例：

```
10
```

### 1.2.2.6. 输出样例：

```
3628800
```

### 1.2.2.7. 样例解释

$10! = 3628800$

### 1.2.2.8. 代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (int) ((long) ans * i % 1000000007);
        }
        System.out.println(ans);
    }
}
```

## 1.2.3. 1000000007

### 1.2.3.1. 问题

给定一个整数$n$，求$n!$除以$1000000007$的余数。

### 1.2.3.2. 输入格式

一个整数$n$。

### 1.2.3.3. 输出格式

一个整数，表示$n!$除以$1000000007$的余数。

### 1.2.3.4. 数据范围

$1 \le n \le 1000000000$

### 1.2.3.5. 输入样例：

```
10
```

### 1.2.3.6. 输出样例：

```
3628800
```

### 1.2.3.7. 样例解释

$10! = 3628800$

### 1.2.3.8. 代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (int) ((long) ans * i % 1000000007);
        }
        System.out.println(ans);
    }
}
```

## 1.2.4. 1000000007

### 1.2.4.1. 问题

给定一个整数$n$，求$n!$除以$1000000007$的余数。

### 1.2.4.2. 输入格式

一个整数$n$。

### 1.2.4.3. 输出格式

一个整数，表示$n!$除以$1000000007$的余数。

### 1.2.4.4. 数据范围

$1 \le n \le 1000000000$

### 1.2.4.5. 输入样例：

```
10
```

### 1.2.4.6. 输出样例：

```
3628800
```

### 1.2.4.7. 样例解释

$10! = 3628800$

### 1.2.4.8. 代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (int) ((long) ans * i % 1000000007);
        }
        System.out.println(ans);
    }
}
```

## 1.2.5. 1000000007

### 1.2.5.1. 问题

给定一个整数$n$，求$n!$除以$1000000007$的余数。

### 1.2.5.2. 输入格式

一个整数$n$。

### 1.2.5.3. 输出格式

一个整数，表示$n!$除以$1000000007$的余数。

### 1.2.5.4. 数据范围

$1 \le n \le 1000000000$

### 1.2.5.5. 输入样例：

```
10
```

### 1.2.5.6. 输出样例：

```
3628800
```

### 1.2.5.7. 样例解释

$10! = 3628800$

### 1.2.5.8. 代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (int) ((long) ans * i % 1000000007);
        }
        System.out.println(ans);
    }
}
```

## 1.2.6. 1000000007

### 1.2.6.1. 问题

给定一个整数$n$，求$n!$除以$1000000007$的余数。

###
