<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N=int(input())
X=P=0
for i in range(10) :
  P=i*111
  if X < N and N <= P :
    print(P)
  X=P
    
```

### Input

The first line of input contains a single integer `N` denoting the number of test cases.

The next `N` lines of input contain a single integer `P` each.

### Output

For each test case, print the value of `P` for which `X` is the smallest and `N` is the largest.

### Constraints

1 <= `N` <= 100

1 <= `P` <= 1000000000

### Example Input

```
3
1
2
3
```

### Example Output

```
111
```

### Explanation

The first test case has `N=3` and `P=1`.

The second test case has `N=2` and `P=2`.

The third test case has `N=3` and `P=3`.

### Hint

You can use the `System.out.println()` method to print the output.

### Java

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = 0;
        int P = 0;
        for (int i = 0; i < N; i++) {
            P = sc.nextInt();
            if (X < N && N <= P) {
                System.out.println(P);
            }
            X = P;
        }
    }
}
```
</s>
