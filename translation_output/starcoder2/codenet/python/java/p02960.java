
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int l = S.length();
        int mod = (int)Math.pow(10, 9) + 7;
        int[][] dp = new int[l + 1][13];
        dp[0][0] = 1;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < 13; j++) {
                if (S.charAt(i) == '?') {
                    for (int k = 0; k < 10; k++) {
                        dp[i + 1][((j * 10) + k) % 13] += dp[i][j];
                        dp[i + 1][((j * 10) + k) % 13] %= mod;
                    }
                } else {
                    dp[i + 1][((j * 10) + (S.charAt(i) - '0')) % 13] += dp[i][j];
                    dp[i + 1][((j * 10) + (S.charAt(i) - '0')) % 13] %= mod;
                }
            }
        }
        System.out.println(dp[l][5]);
    }
}
```

## 2. 1000000007

### 2.1. Problem

Given a number N, find the number of ways to write N as a sum of consecutive numbers.

### 2.2. Input

The first line contains an integer T, the number of test cases. Then T lines follow, each containing an integer N.

### 2.3. Output

For each test case, output the required answer.

### 2.4. Constraints

1 <= T <= 100000

1 <= N <= 1000000000

### 2.5. Example

#### 2.5.1. Input:

```
2
4
5
```

#### 2.5.2. Output:

```
1
2
```

### 2.6. Explanation

For N = 4, the only way is 2 + 2

For N = 5, the ways are 1 + 2 + 2 and 2 + 3

### 2.7. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int ans = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && (N / i - i + 1) % 2 == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 3. 1000000009

### 3.1. Problem

Given a number N, find the number of ways to write N as a sum of consecutive numbers.

### 3.2. Input

The first line contains an integer T, the number of test cases. Then T lines follow, each containing an integer N.

### 3.3. Output

For each test case, output the required answer.

### 3.4. Constraints

1 <= T <= 100000

1 <= N <= 1000000000

### 3.5. Example

#### 3.5.1. Input:

```
2
4
5
```

#### 3.5.2. Output:

```
1
2
```

### 3.6. Explanation

For N = 4, the only way is 2 + 2

For N = 5, the ways are 1 + 2 + 2 and 2 + 3

### 3.7. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int ans = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && (N / i - i + 1) % 2 == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 4. 10000000019

### 4.1. Problem

Given a number N, find the number of ways to write N as a sum of consecutive numbers.

### 4.2. Input

The first line contains an integer T, the number of test cases. Then T lines follow, each containing an integer N.

### 4.3. Output

For each test case, output the required answer.

### 4.4. Constraints

1 <= T <= 100000

1 <= N <= 1000000000

### 4.5. Example

#### 4.5.1. Input:

```
2
4
5
```

#### 4.5.2. Output:

```
1
2
```

### 4.6. Explanation

For N = 4, the only way is 2 + 2

For N = 5, the ways are 1 + 2 + 2 and 2 + 3

### 4.7. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int ans = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && (N / i - i + 1) % 2 == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```
/docs/problems/0000000000/0000000000.md
# 0000000000

## 1. 1000000000

### 1.1. Problem

Given a number N, find the number of ways to write N as a sum of consecutive numbers.

### 1.2. Input

The first line contains an integer T, the number of test cases. Then T lines follow, each containing an integer N.

### 1.3. Output

For each test case, output the required answer.

### 1.4. Constraints

1 <= T <= 100000

1 <= N <= 1000000000

### 1.5. Example

#### 1.5.1. Input:

```
2
4
5
```

#### 1.5.2. Output:

```
1
2
```

### 1.6. Explanation

For N = 4, the only way is 2 + 2

For N = 5, the ways are 1 + 2 + 2 and 2 + 3

### 1.7. Solution

```java
import
