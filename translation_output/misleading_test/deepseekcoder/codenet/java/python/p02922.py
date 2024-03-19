<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 10

Expected output:
32

```
import java.util.Scanner;
public class p02922 {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = (b-1)/(a-1);
    if((b-1)%(a-1)==0) {
    	System.out.println(ans);
    }else {
    	System.out.println(ans+1);
    }
    }
}
```

### Response:
```python
import sys

a, b = map(int, sys.stdin.readline().split())

ans = (b-1)//(a-1)
if (b-1) % (a-1) == 0:
    print(ans)
else:
    print(ans+1)
```

In this Python code, we use the ```sys.stdin.readline().split()``` method to read the input from the console. The ```map()``` function is used to convert the input strings to integers. The ```//``` operator is used for integer division in Python 3. The ```%``` operator is used to get the remainder of the division. The rest of the code is the same as the Java code.
<|EOT|>
