<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x=int(input())

ans=0
q,r=divmod(x,11)
ans+=2*q
q,r=divmod(r,6)
ans+=q
if r>0:
  ans+=1
print(ans)

```

### Input

The first line of input contains a single integer $x$ denoting the number to be translated.

### Output

Print the translated number.

### Constraints

$1 \leq x \leq 10^9$

### Example Input

```
123456789
```

### Example Output

```
123456789
```

### Explanation

The input is a number. The first line of the code translates the number to a string. The second line of the code translates the string to an integer. The third line of the code prints the integer.

### Hint

The first line of the code translates the number to a string. The second line of the code translates the string to an integer. The third line of the code prints the integer.

### Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int q = x / 11;
        int r = x % 11;
        int ans = 2 * q;
        int q1 = r / 6;
        int r1 = r % 6;
        ans += q1;
        if (r1 > 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}
```
</s>
