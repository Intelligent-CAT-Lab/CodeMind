
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] abc = new int[28];
        int[] num = new int[12];
        int abc_sum = 0;
        int num_sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                abc[c - 'a' + 1]++;
                abc_sum++;
            } else if (c >= '0' && c <= '9') {
                num[c - '0' + 1]++;
                num_sum++;
            }
        }
        int ans = 0;
        while (abc_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 27) {
                if (abc[current - 1] == 0 && abc[current] > 0) {
                    start = Math.min(start, current);
                }
                if (abc[current + 1] == 0 && abc[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    abc[current]--;
                    abc_sum--;
                    break;
                }
                if (abc[current] > 0) {
                    abc[current]--;
                    abc_sum--;
                }
                current++;
            }
        }
        while (num_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 11) {
                if (num[current - 1] == 0 && num[current] > 0) {
                    start = Math.min(start, current);
                }
                if (num[current + 1] == 0 && num[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    num[current]--;
                    num_sum--;
                    break;
                }
                if (num[current] > 0) {
                    num[current]--;
                    num_sum--;
                }
                current++;
            }
        }
        System.out.println(ans);
    }
}
```

## 2. 1000000007

### 2.1. 题目描述

给定一个整数n，求n的阶乘的最后7位数。

### 2.2. 输入格式

一个整数n。

### 2.3. 输出格式

一个整数，表示n的阶乘的最后7位数。

### 2.4. 样例输入

```
10
```

### 2.5. 样例输出

```
3628800
```

### 2.6. 数据规模与约定

1 <= n <= 1000000000

### 2.7. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}
```

## 3. 1000000007

### 3.1. 题目描述

给定一个整数n，求n的阶乘的最后7位数。

### 3.2. 输入格式

一个整数n。

### 3.3. 输出格式

一个整数，表示n的阶乘的最后7位数。

### 3.4. 样例输入

```
10
```

### 3.5. 样例输出

```
3628800
```

### 3.6. 数据规模与约定

1 <= n <= 1000000000

### 3.7. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}
```

## 4. 1000000007

### 4.1. 题目描述

给定一个整数n，求n的阶乘的最后7位数。

### 4.2. 输入格式

一个整数n。

### 4.3. 输出格式

一个整数，表示n的阶乘的最后7位数。

### 4.4. 样例输入

```
10
```

### 4.5. 样例输出

```
3628800
```

### 4.6. 数据规模与约定

1 <= n <= 1000000000

### 4.7. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}
```

## 5. 1000000007

### 5.1. 题目描述

给定一个整数n，求n的阶乘的最后7位数。

### 5.2. 输入格式

一个整数n。

### 5.3. 输出格式

一个整数，表示n的阶乘的最后7位数。

### 5.4. 样例输入

```
10
