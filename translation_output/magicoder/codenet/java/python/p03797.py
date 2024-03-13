<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    sum = 0
    if N * 2 > M:
        sum = M // 2
    elif M > N * 2:
        sum = N
        sum += ((M - N * 2) // 4)
    print(sum)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the sum based on the conditions in the Java code, and then prints the result.<｜end▁of▁sentence｜>
