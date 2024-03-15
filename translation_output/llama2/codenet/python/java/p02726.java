<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,x,y = [int(n) for n in input().split()]


ans = [0] * (n-1)

for i in range(n-1):
    for j in range(i+1,n):
        a=j-i
        b=abs((y-1)-j)+abs(i-(x-1))+1
        ans[min(a,b)-1]+=1
for i in ans:
	print(i)        

```

### Input

The first line of input contains three integers, $n$, $x$ and $y$.

### Output

Print the answer to the problem.

### Constraints

$1 \leq n \leq 10^5$

$1 \leq x,y \leq 10^5$

### Sample Input

```
4 1 2
```

### Sample Output

```
1
1
1
1
```

### Explanation

The first line of input contains three integers, $n$, $x$ and $y$.

### Hint

Use a for loop to iterate over the range of $n-1$.

### Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x,y;
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int[] ans = new int[n-1];
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                int a = j-i;
                int b = Math.abs((y-1)-j)+Math.abs(i-(x-1))+1;
                ans[Math.min(a,b)-1]++;
            }
        }
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
```
</s>
