<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
25

Expected output:
+0-+

```
import java.util.Scanner;
// 0306
class p00301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[15],i=0;
        while(n>0) {
            a[i++]=(n+1)%3-1;
            n=(n-a[i-1])/3;
        }
        while(i-->0)
            System.out.print((a[i]==0?"0":a[i]>0?"+":"-")+(i==0?"\n":""));
    }
}

```

### Response:
```python
def base3(n):
    if n == 0:
        return [0]
    nums = []
    while n:
        n, r = divmod(n, 3)
        nums.append(r)
    return nums[::-1]

def convert_base3(n):
    nums = base3(n)
    for i in range(len(nums)):
        if nums[i] == 0:
            nums[i] = '0'
        elif nums[i] > 0:
            nums[i] = '+'
        else:
            nums[i] = '-'
    return ''.join(nums)

n = int(input())
print(convert_base3(n))
```

This Python code works by first defining a helper function `base3` that converts a number to base 3 and returns the digits in reverse order. Then it defines another function `convert_base3` that converts these digits to the appropriate symbols ('+', '-', '0') and joins them together into a string. Finally, it reads an integer from input, converts it to base 3, and prints the result.
<|EOT|>
