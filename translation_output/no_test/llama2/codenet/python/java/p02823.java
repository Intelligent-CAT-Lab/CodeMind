<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N,A,B = map(int,input().split())
if (A-B)%2==0:
  print((B-A)//2)
else:
  print(min(A-1,N-B)+1+(B-A)//2)
```

### Input

The first line of input contains three integers N, A and B.

### Output

Print the output in a single line.

### Constraints

1 <= N <= 10^5

1 <= A, B <= N

### Sample Input

```
4 1 2
```

### Sample Output

```
1
```

### Explanation

The output is 1 because (1-2)%2==0.

### Hint

Use the modulo operator to check if the difference between A and B is even or odd.

### Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if ((A-B)%2==0) {
            System.out.println((B-A)/2);
        } else {
            System.out.println(Math.min(A-1,N-B)+1+(B-A)/2);
        }
    }
}
```
</s>
