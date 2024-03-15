<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,i=map(int,input().split())
print(n+1-i)
```

### Input

The first line of input contains two integers, $n$ and $i$.

### Output

Print the result of the expression $n+1-i$.

### Constraints

$1 \leq n \leq 10^5$

$1 \leq i \leq n$

### Sample Input

```
4 2
```

### Sample Output

```
2
```

### Explanation

```
n = 4
i = 2

n+1-i = 4+1-2 = 3
```

### Hint

Use the `Scanner` class to read the input.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        i = sc.nextInt();
        System.out.println(n+1-i);
    }
}
```
</s>
