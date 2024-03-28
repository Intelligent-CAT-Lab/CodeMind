<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,k=map(int,input().split())
print(k*(k-1)**(n-1))
```

### Input

The first line of input contains two integers, $n$ and $k$.

### Output

Print the output in a single line.

### Constraints

$1 \leq n \leq 10^5$

$1 \leq k \leq 10^5$

### Sample Input

```
4 3
```

### Sample Output

```
12
```

### Explanation

The output is $k*(k-1)*(k-2)*(k-3)*(k-4)$

### Hint

Use the formula for the sum of the first $n$ terms of the sequence $a_n=a_{n-1}+a_{n-2}$

### Submitting In Solution

If you are using IDE like PyCharm, you can submit your solution in Solution tab of the PyCharm.

### Testing

Copy-paste the following code in Solution tab and press Ctrl+F11 to execute and check your solution.

```
import sys

if __name__ == '__main__':
    f = open(sys.argv[1], 'r')
    solution = f.read()
    f.close()

    print(solution)
```

### Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println(k*(k-1)*(k-2)*(k-3)*(k-4));
    }
}
```
</s>
