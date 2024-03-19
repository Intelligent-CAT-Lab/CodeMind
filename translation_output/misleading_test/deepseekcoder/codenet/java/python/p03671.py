<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
700 600 780

Expected output:
1222

```
import java.util.*;
public class p03671{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] sum = {a,b,c};
        Arrays.sort(sum);

        System.out.println(sum[0]+sum[1]);
    }

}

```

### Response:
```python
def p03671(a, b, c):
    sum = [a, b, c]
    sum.sort()
    return sum[0] + sum[1]

# Test input
a = 700
b = 600
c = 780

# Expected output
print(p03671(a, b, c))
```

This Python function `p03671` takes three integers as input, sorts them in ascending order, and returns the sum of the first two elements. The test input and expected output are provided at the end of the code.
<|EOT|>
