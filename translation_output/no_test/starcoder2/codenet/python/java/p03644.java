
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1, k = 0;
        for (int i = 2; i <= N; i += 2) {
            int temp = i, res = 0;
            while (temp % 2 == 0) {
                res++;
                temp /= 2;
            }
            if (k < res) {
                ans = i;
                k = res;
            }
        }
        System.out.println(ans);
    }
}
```

## 2. 1000000007

### 2.1. Description

Given an integer N, find the largest integer K such that K is a divisor of N and K is a power of 2.

### 2.2. Input

The first line contains an integer T, the number of test cases. Then T test cases follow.

Each test case contains an integer N.

### 2.3. Output

For each test case, print the required answer in a new line.

### 2.4. Constraints

1 ≤ T ≤ 100000

1 ≤ N ≤ 1000000000

### 2.5. Sample Input

```
3
1
2
3
```

### 2.6. Sample Output

```
1
2
1
```

### 2.7. Explanation

In the first case, 1 is the largest power of 2 that divides 1.

In the second case, 2 is the largest power of 2 that divides 2.

In the third case, 1 is the largest power of 2 that divides 3.

### 2.8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int ans = 1, k = 0;
            for (int i = 2; i <= N; i += 2) {
                int temp = i, res = 0;
                while (temp % 2 == 0) {
                    res++;
                    temp /= 2;
                }
                if (k < res) {
                    ans = i;
                    k = res;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 3. 1000000009

### 3.1. Description

Given an integer N, find the largest integer K such that K is a divisor of N and K is a power of 5.

### 3.2. Input

The first line contains an integer T, the number of test cases. Then T test cases follow.

Each test case contains an integer N.

### 3.3. Output

For each test case, print the required answer in a new line.

### 3.4. Constraints

1 ≤ T ≤ 100000

1 ≤ N ≤ 1000000000

### 3.5. Sample Input

```
3
1
2
3
```

### 3.6. Sample Output

```
1
1
1
```

### 3.7. Explanation

In the first case, 1 is the largest power of 5 that divides 1.

In the second case, 1 is the largest power of 5 that divides 2.

In the third case, 1 is the largest power of 5 that divides 3.

### 3.8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int ans = 1, k = 0;
            for (int i = 5; i <= N; i += 5) {
                int temp = i, res = 0;
                while (temp % 5 == 0) {
                    res++;
                    temp /= 5;
                }
                if (k < res) {
                    ans = i;
                    k = res;
                }
            }
            System.out.println(ans);
        }
    }
}
```
 1000000000

### 2.5. Sample Input

```
3
1
2
3
```

### 2.6. Sample Output

```
1
1
1
```

### 2.7. Explanation

In the first case, 1 is the largest power of 5 that divides 1.

In the second case, 1 is the largest power of 5 that divides 2.

In the third case, 1 is the largest power of 5 that divides 3.

### 2.8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int ans = 1, k = 0;
            for (int i = 5; i <= N; i += 5) {
                int temp = i, res = 0;
                while (temp % 5 == 0) {
                    res++;
                    temp /= 5;
                }
                if (k < res) {
                    ans = i;
                    k = res;
                }
            }
            System.out.println(ans);
        }
    }
}
```
# 1000000009

## 1. Description

Given an integer N, find the largest integer K such that K is a divisor of N and K is a power of 5.

## 2. Input

The first line contains an integer T, the number of test cases. Then T test cases follow.

Each test case contains an integer N.

## 3. Output

For each test case, print the required answer in a new line.

## 4. Constraints

1 ≤ T ≤ 100000

1 ≤ N ≤ 1000000000

## 5. Sample Input

```
3
1
2
3
```

## 6. Sample Output

```
1
1
1
```

## 7. Explanation

In the first case, 1 is the largest power of 5 that divides 1.

In the second case, 1 is the largest power of 5 that divides 2.

In the third case, 1 is the largest power of 5 that divides 3.

## 8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int ans = 1, k = 0;
            for (int i = 5; i <= N; i += 5) {
                int temp = i, res = 0;
                while (temp % 5 == 0) {
                    res++;
                    temp /= 5;
                }
                if (k < res) {
                    ans = i;
                    k = res;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 9. 1000000009

### 9.1. Description

Given an integer N, find the largest integer K such that K is a divisor of N and K is a power of 5.

### 9.2. Input

The first line contains an integer T, the number of test cases. Then T test cases follow.

Each test case contains an integer N.

### 9.3. Output
