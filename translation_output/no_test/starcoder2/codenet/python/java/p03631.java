
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n / 100;
        int j = n % 10;
        if (i == j) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```


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
                if (a[i] == a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```
/ABC/ABC160/B.md
# B - Golden Coins

## Problem Statement

Takahashi has N gold coins. He wants to exchange them for yen.

The exchange rate is 1 gold coin = 100 yen.

Takahashi will also receive a bonus if he exchanges the coins in a particular way.

Specifically, if he exchanges all of the coins in such a way that the number of gold coins is a multiple of 5, he will receive an additional 1900 yen.

Find the maximum amount of yen Takahashi can receive.

## Constraints

- 1≤N≤100

## Input

Input is given from Standard Input in the following format:

```
N
```

## Output

Print the maximum amount of yen Takahashi can receive.

## Sample Input 1

```
1
```

## Sample Output 1

```
100
```

Takahashi has 1 gold coin. He can exchange it for 100 yen.

## Sample Input 2

```
2
```

## Sample Output 2

```
200
```

Takahashi has 2 gold coins. He can exchange them for 200 yen.

## Sample Input 3

```
5
```

## Sample Output 3

```
500
```

Takahashi has 5 gold coins. He can exchange them for 500 yen.

## Sample Input 4

```
100
```

## Sample Output 4

```
190000
```

Takahashi has 100 gold coins. He can exchange them for 10000 yen.

He can also exchange them for 10000+1900=19100 yen by using the bonus.

## Note

In the last sample, the bonus is used even if the number of gold coins is not a multiple of 5.

## Java code/ABC/ABC160/C.md
# C - Traveling Salesman around Lake

## Problem Statement

There is a lake of length K meters.

There are N islands on the lake. The i-th island is located at a distance of Ai meters from the starting point of the lake.

Takahashi is going to travel around the lake by boat.

He will start at the starting point of the lake, and travel to each of the N islands in some order, and then return to the starting point of the lake.

He will not stop at any of the islands.

Find the minimum possible total distance traveled by Takahashi.

## Constraints

- 2≤N≤2000
- 1≤K≤109
- 1≤Ai≤K−1
- All values in input are integers.

## Input

Input is given from Standard Input in the following format:

```
N K
A1 A2 ... AN
```

## Output

Print the minimum possible total distance traveled by Takahashi.

## Sample Input 1

```
3 10
1 3 4
```

## Sample Output 1

```
3
```

Takahashi will travel in the following order:

- Start at the starting point of the lake.
- Travel to the 1-st island.
- Travel to the 3-rd island.
- Travel to the 2-nd island.
- Return to the starting point of the lake.

The total distance traveled is 1+3+2+1=7.

## Sample Input 2

```
4 10
1 3 4 9
```

## Sample Output 2

```
4
```

Takahashi will travel in the following order:

- Start at the starting point of the lake.
- Travel to the 1-st island.
- Travel to the 3-rd island.
- Travel to the 2-nd island.
- Travel to the 4-th island.
- Return to the starting point of the lake.

The total distance traveled is 1+3+2+1+1=8.

## Sample Input 3

```
5 10
1 3 4 9 9
```

## Sample Output 3

```
5
```

Takahashi will travel in the following order:

- Start at the starting point of the lake.
- Travel to the 1-st island.
- Travel to the 3-rd island.
- Travel to the 2-nd island.
- Travel to the 4-th island.
- Travel to the 5-th island.
- Return to the starting point of the lake.

The total distance traveled is 1+3+2+1+1+1=8.

## Note

In the first sample, the total distance traveled is minimized if Takahashi travels in the order described above.

In the second sample, the total distance traveled is minimized if Takahashi travels in the order described above.

In the third sample, the total distance traveled is minimized if Takahashi travels in the order described above.

## Java code

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int d = a[j] - a[i];
                if (d > k / 2) {
                    d = k - d;
                }
                ans = Math.min(ans, d);
            }
        }
        System.out.println(ans);
    }
}
```

## Python code

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))
ans = 10 ** 9
for i in range(n):
    for j in range(i + 1, n):
        d = a[j] - a[i]
        if d > k // 2:
            d = k - d
        ans = min(ans, d)
print(ans)
```

## Python code (TLE)

```python
n, k = map(int, input().split())
a = list(
