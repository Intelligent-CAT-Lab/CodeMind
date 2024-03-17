<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

N, M = map(int, sys.stdin.readline().split())

if N * 2 > M:
    print(M // 2)
elif M > N * 2:
    print(N + (M - N * 2) // 4)
else:
    print(N)
```
<|endoftext|>
