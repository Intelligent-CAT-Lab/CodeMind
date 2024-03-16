<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
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
Note: The `//` operator is used for integer division in Python, which is equivalent to the `floor()` function in Java.</s>
