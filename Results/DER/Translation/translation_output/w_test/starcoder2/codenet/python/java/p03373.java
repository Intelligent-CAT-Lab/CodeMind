
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        if (2 * c <= a + b) {
            ans += Math.min(x, y) * 2 * c;
            int q = Math.min(x, y);
            x -= q;
            y -= q;
            if (x > 0 && 2 * c <= a) {
                ans += 2 * c * x;
            } else if (x > 0) {
                ans += a * x;
            } else if (y > 0 && 2 * c <= b) {
                ans += 2 * c * y;
            } else {
                ans += b * y;
            }
        } else {
            ans = x * a + y * b;
        }
        System.out.println(ans);
    }
}
```

## 2. 1005. 剪绳子

### 题目描述

给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。

### 输入描述

输入为一行，包含两个整数n和m，以空格分隔。

### 输出描述

输出一个整数，表示剪绳子的最大乘积。

### 样例

#### 样例1

##### 输入

```
8 3
```

##### 输出

```
18
```

### 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        System.out.println(dp[n]);
    }
}
```

## 3. 1006. 买卖股票的最佳时机

### 题目描述

假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？

### 输入描述

输入为一行，包含一个整数n，表示数组长度。

接下来一行包含n个整数，表示股票在连续的n天中的价格。

### 输出描述

输出一个整数，表示最大利润。

### 样例

#### 样例1

##### 输入

```
6
7 1 5 3 6 4
```

##### 输出

```
5
```

### 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        System.out.println(max);
    }
}
```

## 4. 1007. 连续子数组的最大和

### 题目描述

输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为O(n)。

### 输入描述

输入为两行，第一行包含一个整数n，表示数组长度。

第二行包含n个整数，表示数组中的每个元素。

### 输出描述

输出一个整数，表示最大和。

### 样例

#### 样例1

##### 输入

```
6
1 -2 3 10 -4 7
```

##### 输出

```
18
```

### 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
```

## 5. 1008. 数组中出现次数超过一半的数字

### 题目描述

数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。

### 输入描述

输入为两行，第一行包含一个整数n，表示数组长度。

第二行包含n个整数，表示数组中的每个元素。

### 输出描述

输出一个整数，表示超过数组长度一半的数字。

### 样例

#### 样例1

##### 输入

```
10
1 2 3 2 2 2 5 4 2 2
```

##### 输出

```
2
```

### 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int count = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ans = nums[i];
                count++;
            } else if (nums[i] == ans) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(ans);
    }
}
```

## 6. 1009. 二维数组中的查找

### 题目描述

在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上
