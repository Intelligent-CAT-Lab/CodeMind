<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
25

```
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class p03387 {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int[] x=new int[3];
x[0]=sc.nextInt();
x[1]=sc.nextInt();
x[2]=sc.nextInt();
Arrays.sort(x);
int temp=2*x[2]-x[1]-x[0];
int ans;
if(temp%2==1){ans=(temp+2)/2+1;}else{ans=temp/2;}
out.println(ans);
}}
```

### Response:
```python
import sys
import math

def main():
    x = [int(i) for i in sys.stdin.readline().split()]
    x.sort()
    temp = 2 * x[2] - x[1] - x[0]
    if temp % 2 == 1:
        ans = (temp + 2) // 2 + 1
    else:
        ans = temp // 2
    print(ans)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline().split()` function to read the input from the standard input. The `//` operator is used for integer division in Python. The `%` operator is used to get the remainder of the division. The `if __name__ == "__main__":` line is used to call the `main()` function when the script is run directly.
<|EOT|>
