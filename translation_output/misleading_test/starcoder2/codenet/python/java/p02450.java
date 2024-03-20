

```java
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        List<int[]> perms = new ArrayList<>();
        permute(arr, 0, perms);
        for (int[] perm : perms) {
            for (int i = 0; i < perm.length; i++) {
                System.out.print(perm[i] + " ");
            }
            System.out.println();
        }
    }

    public static void permute(int[] arr, int start, List<int[]> perms) {
        if (start == arr.length - 1) {
            perms.add(arr.clone());
        } else {
            for (int i = start; i < arr.length; i++) {
                swap(arr, start, i);
                permute(arr, start + 1, perms);
                swap(arr, start, i);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
```
/10-days-of-statistics/day-0-weighted-mean.md
# Day 0: Weighted Mean

Given an array, $X$, of $N$ integers and an array, $W$, representing the respective weights of $X$'s elements, calculate and print the weighted mean of $X$'s elements. Your answer should be rounded to a scale of $1$ decimal place (i.e., $12.3$ format).

**Input Format**

The first line contains an integer, $N$, denoting the number of elements in arrays $X$ and $W$.
The second line contains $N$ space-separated integers describing the respective elements of array $X$.
The third line contains $N$ space-separated integers describing the respective elements of array $W$.

**Constraints**

- $5 \le N \le 50$
- $0 \le X_i \le 100$
- $0 \le W_i \le 100$

**Output Format**

Print the weighted mean on a new line. Your answer should be rounded to a scale of $1$ decimal place (i.e., $12.3$ format).

**Sample Input**

```
5
10 40 30 50 20
1 2 3 4 5
```

**Sample Output**

```
32.0
```

**Explanation**

The first line contains an integer, $N = 5$, denoting the number of elements in arrays $X$ and $W$.
The second line contains $5$ space-separated integers describing the respective elements of array $X$.
The third line contains $5$ space-separated integers describing the respective elements of array $W$.

We calculate the following weighted mean:

$$
\begin{aligned}
\mu &= \frac{10 \times 1 + 40 \times 2 + 30 \times 3 + 50 \times 4 + 20 \times 5}{1 + 2 + 3 + 4 + 5} \\
&= \frac{1 \times 1 + 40 \times 2 + 30 \times 3 + 50 \times 4 + 20 \times 5}{15} \\
&= \frac{1 + 80 + 90 + 200 + 100}{15} \\
&= \frac{471}{15} \\
&= 31.4
\end{aligned}
$$

We then print our result to a scale of $1$ decimal place, which is $31.4$ as our answer.

**Solution**

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        sc.close();
        System.out.printf("%.1f", weightedMean(x, w));
    }

    public static double weightedMean(int[] x, int[] w) {
        double sum = 0;
        int totalWeight = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] * w[i];
            totalWeight += w[i];
        }
        return sum / totalWeight;
    }
}
```

**Solution**

```python
n = int(input())
x = list(map(int, input().split()))
w = list(map(int, input().split()))
print(sum([x[i] * w[i] for i in range(n)]) / sum(w))
```

**Solution**

```python
n = int(input())
x = list(map(int, input().split()))
w = list(map(int, input().split()))
print(sum([x[i] * w[i] for i in range(n)]) / sum(w))
```

**Solution**

```python
n = int(input())
x = list(map(int, input().split()))
w = list(map(int, input().split()))
print(sum([x[i] * w[i] for i in range(n)]) / sum(w))
```

**Solution**

```python
n = int(input())
x = list(map(int, input().split()))
w = list(map(int, input().split()))
print(sum([x[i] * w[i] for i in range(n)]) / sum(w))
```

**Solution**

```python
n = int(input())
x = list(map(int, input().split()))
w = list(map(int, input().split()))
print(sum([x[i] * w[i] for i in range(n)]) / sum(w))
```

**Solution**

```python
n = int(input())
x = list(map(int, input().split()))
w = list(map(int, input().split()))
print(sum([x[i] * w[i] for i in range(n)]) / sum(w))
```

**Solution**

```python
n = int(input())
x = list(map(int, input().split()))
w = list(map(int, input().split()))
print(sum([x[i] * w[i] for i in range(n)]) / sum(w))
```

**Solution**

```python
n = int(input())
x = list(map(int, input().split()))
w = list(map(int, input().split()))
print(sum([x[i] * w[i] for i in range(n)]) / sum(w))
```

**Solution**

```python
n = int(input())
x = list(map(int, input().split()))
w = list(map(int, input().split()))
print(sum([x[i] * w[i] for i in range(n)]) / sum(w))
```

**Solution**

```python
n = int(input())
x = list(map(int, input().split()))
w = list(map(int, input().split()))
print(sum([x[i] * w[i] for i in range(n)]) / sum(w))
```

**Solution**

```python
n = int(input())
x = list(map(int, input().split()))
w = list(map(int, input().split()))
print(sum([x[i] * w[i] for i in range(n)]) / sum(w))
```

**Solution**


