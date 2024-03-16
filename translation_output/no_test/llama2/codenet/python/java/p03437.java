<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x,y=map(int,input().split())
print(x if x%y else -1)
```

### Input

The first line of input contains a single integer $T$ denoting the number of test cases.

The first line of each test case contains two space separated integers $x$ and $y$ denoting the values of $x$ and $y$ respectively.

### Output

For each test case, print the value of $x$ if $x$ is divisible by $y$ else print $-1$.

### Constraints

$1 \leq T \leq 10^5$

$1 \leq x,y \leq 10^9$

### Example Input

```
3
1 2
2 3
1 1
```

### Example Output

```
1
-1
1
```

### Explanation

```
x=1, y=2
x=2, y=3
x=1, y=1
```

### Hint

Use the `Scanner` class to read the input.

### Solution

```java
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            if(x%y==0)
                System.out.println(x);
            else
                System.out.println(-1);
        }
    }
}
```
</s>
