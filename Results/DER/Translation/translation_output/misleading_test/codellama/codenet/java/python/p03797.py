<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

N, M = map(int, sys.stdin.readline().split())
sum = 0

if N * 2 > M:
    sum = M // 2
elif M > N * 2:
    sum = N
    sum += (M - N * 2) // 4

print(sum)
```
This code reads the input from stdin, splits it into two integers N and M, and then calculates the sum based on the given conditions. The output is then printed to stdout.

Note that in Python, the `//` operator is used for integer division, which returns the integer part of the result, while the `/` operator returns the floating-point result.</s>
