
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        if (k % 2 == 1) {
            ans = (int) Math.pow(n / k, 3);
        } else {
            ans = (int) Math.pow(n / k, 3) + (int) Math.pow((n + k / 2) / k, 3);
        }
        System.out.println(ans);
    }
}
```


```

java code:
```java
import java.util.*;

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
                    if (a[i] == a[j] || a[j] == a[k] || a[k] == a[i]) {
                        continue;
                    }
                    if (a[i] + a[j] > a[k] && a[j] + a[k] > a[i] && a[k] + a[i] > a[j]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
/ABC/ABC149/C.md
# C - Next Prime

## Problem Statement

Takahashi has an integer N. Find the smallest prime number greater than N.

## Constraints

- 1 ≤ N ≤ 10^9

## Input

Input is given from Standard Input in the following format:

```
N
```

## Output

Print the smallest prime number greater than N.

## Sample Input 1

```
7
```

## Sample Output 1

```
11
```

## Sample Input 2

```
100
```

## Sample Output 2

```
101
```

## Sample Input 3

```
999999937
```

## Sample Output 3

```
999999997
```

## Note

In the first sample, 7 is not a prime number, but 11 is the smallest prime number greater than 7.

In the second sample, 100 is not a prime number, but 101 is the smallest prime number greater than 100.

In the third sample, 999999937 is a prime number.

## Solution

```python
import sys

def main():
    n = int(input())

    while True:
        n += 1
        if is_prime(n):
            print(n)
            break


def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True


if __name__ == '__main__':
    main()

```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true) {
            n++;
            if (isPrime(n)) {
                System.out.println(n);
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## D - Prediction and Restriction

## Problem Statement

Takahashi has a sequence A of length N. He will perform the following operation exactly once:

- Choose an integer i (1 ≤ i ≤ N) and an integer x. Then, replace Ai with x.

Takahashi wants to make the sequence A satisfy the following condition:

- For any 1 ≤ i < j < k ≤ N, Ai < Aj < Ak holds.

Find the minimum possible value of x that satisfies the condition.

## Constraints

- 3 ≤ N ≤ 200
- 1 ≤ Ai ≤ 10^9

## Input

Input is given from Standard Input in the following format:

```
N
A1 A2 ... AN
```

## Output

Print the minimum possible value of x that satisfies the condition.

## Sample Input 1

```
3
1 2 3
```

## Sample Output 1

```
2
```

## Sample Input 2

```
3
3 2 1
```

## Sample Output 2

```
2
```

## Sample Input 3

```
4
1 2 3 4
```

## Sample Output 3

```
3
```

## Note

In the first sample, the sequence already satisfies the condition, so we do not need to perform the operation.

In the second sample, we can perform the operation with i = 2 and x = 2. Then, the sequence becomes 3, 2, 2, which satisfies the condition.

In the third sample, we can perform the operation with i = 3 and x = 3. Then, the sequence becomes 1, 2, 3, 3, which satisfies the condition.

## Solution

```python
import sys

def main():
    n = int(input())
    a = list(map(int, input().split()))

    ans = 10**9

    for i in range(n):
        for j in range(i + 1, n):
            for k in range(j + 1, n):
                if a[i] == a[j] or a[j] == a[k] or a[k] == a[i]:
                    continue
                if a[i] < a[j] < a[k]:
                    ans = min(ans, a[i] + a[j] + a[k] - max(a[i], a[j], a[k]) - min(a[i], a[j], a[k]))
    print(ans)


if __name__ == '__main__':
    main()/ABC/ABC150/C.md
# C - Count Order

## Problem Statement

There are N distinct integers between 1 and N, inclusive.

Snuke wrote down all the permutations of these N integers in the order of increasing lexicographical order.

Find the index of the permutation that is the K-th in the order.

## Constraints

- 2 ≤ N ≤ 20
- 1 ≤ K ≤ N!

## Input

Input is given from Standard Input in the following format:

```
N K
```

## Output

Print the index of the permutation that is the K-th in the order.

## Sample Input 1

```
3 3
```

## Sample Output 1

```
2 3 1
```

## Sample Input 2

```
4 12
```

## Sample Output 2

```
4 2 3 1
```

## Sample Input 3

```
20 1000000
```

## Sample Output 3

```
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
```

## Note
