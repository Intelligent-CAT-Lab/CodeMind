<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2 2 -65

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class p03589 {
	
	public static void main(String[] args) {
		new p03589().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		for(long h=1;h<=3500;h++) {
			for(long n=1;n<=3500;n++) {
				if(4*h*n-N*n-N*h!=0 && (N*h*n)/(4*h*n-N*n-N*h)>0 && (N*h*n)%(4*h*n-N*n-N*h)==0) {
					System.out.println(h+" "+n+" "+(N*h*n)/(4*h*n-N*n-N*h));
					return;
				}
			}
		}
	}
}

```

### Response:
```python
def solve():
    N = int(input())
    for h in range(1, 3501):
        for n in range(1, 3501):
            if 4*h*n-N*n-N*h != 0 and (N*h*n)/(4*h*n-N*n-N*h) > 0 and (N*h*n)%(4*h*n-N*n-N*h) == 0:
                print(h, n, (N*h*n)/(4*h*n-N*n-N*h))
                return

solve()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then iterates over possible values of `h` and `n`, checking if the conditions in the if statement are met. If they are, it prints the values of `h`, `n`, and `(N*h*n)/(4*h*n-N*n-N*h)` and returns.
<|EOT|>
