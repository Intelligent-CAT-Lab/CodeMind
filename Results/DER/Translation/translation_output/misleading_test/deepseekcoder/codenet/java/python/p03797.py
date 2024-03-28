<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 6

Expected output:
0

```
import java.util.*;
public class p03797{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong(),M=sc.nextLong(),sum=0;
			if(N*2>M){
			sum=M/2;
			}
			else if(M>N*2){
			sum=N;
			sum=sum+((M-N*2)/4);
			}
			System.out.println(sum);
	}
}
```

### Response:
```python
import sys

def solve(N, M):
    sum = 0
    if N * 2 > M:
        sum = M // 2
    elif M > N * 2:
        sum = N
        sum += ((M - N * 2) // 4)
    return sum

N, M = map(int, sys.stdin.readline().split())
print(solve(N, M))
```

In this Python code, we define a function `solve` that takes two arguments `N` and `M`. The function calculates the sum based on the conditions in the Java code and returns the result. The `map` function is used to read the input from the standard input and convert it to integers. The result is printed to the standard output.
<|EOT|>
