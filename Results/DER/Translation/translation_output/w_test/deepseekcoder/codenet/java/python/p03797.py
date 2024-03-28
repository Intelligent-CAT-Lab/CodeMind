<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 6

Expected output:
2


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
def p03797():
    N, M = map(int, input().split())
    sum = 0
    if N * 2 > M:
        sum = M // 2
    elif M > N * 2:
        sum = N
        sum += (M - N * 2) // 4
    print(sum)

p03797()
```

This Python code does the same thing as the Java code. It reads two integers from the input, calculates the sum based on the conditions in the Java code, and then prints the result. The `//` operator in Python is used for integer division, which discards the fractional part and returns the integer part of the division.
<|EOT|>
