<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
125

Expected output:
220

```
import java.util.*;

class p03999{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ans = 0;
        for(int dx=0;dx<=s.length()-1;dx++){
            for(int start=0;start<=s.length()-1-dx;start++){
                long cur = Long.parseLong(s.substring(start,start+dx+1));
                ans += cur*(helper(start)*helper(s.length()-1-dx-start));
            }
        }
        System.out.println(ans);
    }
    static long helper(int n){
        if(n==0) return 1;
        return 1<<(n-1);
    }
}

```

### Response:
```python
def helper(n):
    if n == 0:
        return 1
    return 2 ** (n - 1)

def p03999(s):
    ans = 0
    for dx in range(len(s)):
        for start in range(len(s) - dx):
            cur = int(s[start:start + dx + 1])
            ans += cur * (helper(start) * helper(len(s) - dx - start - 1))
    return ans

print(p03999(input()))
```

This Python code does the same thing as the Java code. It reads a string of digits from the input, calculates the sum of all possible sub-strings of the input string, and multiplies each sub-string by the product of the helper function evaluated at the start and end indices of the sub-string, and adds this product to the total sum. The helper function simply returns 2 to the power of the input minus 1, which is equivalent to 2 to the power of the input minus 1 in binary.
<|EOT|>
