
```java
import java.util.*;
import java.math.*;

public class Main {
    static final int D = 20;
    static final int[] ds = new int[D];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for (int i = 1; i < D; i++) {
            int fr = (int)Math.pow(10, i-1)-1;
            int to = (int)Math.pow(10, i)-1;
            ds[i] = ds[i-1] + (4-i)*(to/3 + to/5 - (to/15)*2 - fr/3 - fr/5 + (fr/15)*2) + (8-i)*(to/15 - fr/15) + i*(to-fr);
        }
        int left = 0, right = (int)Math.pow(10, 18);
        while (left+1 < right) {
            int mid = (left + right) / 2;
            if (calc(mid) <= s-1) {
                left = mid;
            } else {
                right = mid;
            }
        }
        int idx = calc(left);
        int num = left+1;
        String ans = "";
        while (ans.length() < s - idx + 20) {
            if (num % 15 == 0) {
                ans += "FizzBuzz";
            } else if (num % 3 == 0) {
                ans += "Fizz";
            } else if (num % 5 == 0) {
                ans += "Buzz";
            } else {
                ans += String.valueOf(num);
            }
            num++;
        }
        System.out.println(ans.substring(s-idx-1, s-idx+19));
    }

    static int calc(int m) {
        if (m == 0) {
            return 0;
        }
        int c = (int)Math.log10(m)+1;
        int fr = (int)Math.pow(10, c-1)-1;
        int to = m;
        return ds[c-1] + (4-c)*(to/3 + to/5 - (to/15)*2 - fr/3 - fr/5 + (fr/15)*2) + (8-c)*(to/15 - fr/15) + c*(to-fr);
    }
}
```

## 2. 1000000007

### 2.1. Problem

Given a positive integer N, find the number of ways to write N as a sum of consecutive positive integers.

### 2.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The only line of each test case contains a single integer N.

### 2.3. Output

For each test case, output a single line containing the answer.

### 2.4. Constraints

1 ≤ T ≤ 100000

1 ≤ N ≤ 1000000000

### 2.5. Example

#### 2.5.1. Input:

```
3
1
4
10
```

#### 2.5.2. Output:

```
1
2
3
```

### 2.6. Explanation

#### 2.6.1. Case 1:

N = 1. The only way is 1.

#### 2.6.2. Case 2:

N = 4. The ways are 1+2+1 and 4.

#### 2.6.3. Case 3:

N = 10. The ways are 1+2+3+4, 2+3+4 and 10.

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
                if (N % i == 0 && (N/i - i + 1) % 2 == 0) {
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

Given a positive integer N, find the number of ways to write N as a sum of consecutive positive integers.

### 3.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The only line of each test case contains a single integer N.

### 3.3. Output

For each test case, output a single line containing the answer.

### 3.4. Constraints

1 ≤ T ≤ 100000

1 ≤ N ≤ 1000000000

### 3.5. Example

#### 3.5.1. Input:

```
3
1
4
10
```

#### 3.5.2. Output:

```
1
2
3
```

### 3.6. Explanation

#### 3.6.1. Case 1:

N = 1. The only way is 1.

#### 3.6.2. Case 2:

N = 4. The ways are 1+2+1 and 4.

#### 3.6.3. Case 3:

N = 10. The ways are 1+2+3+4, 2+3+4 and 10.

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
                if (N % i == 0 && (N/i - i + 1) % 2 == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```
/2017/01/2017-01-22.md
# 2017-01-22

## 1. 1
