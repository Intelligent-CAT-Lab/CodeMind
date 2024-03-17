<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2 2


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
[/INST]
```python
import math

def solve():
    N = int(input())
    for h in range(1, 3501):
        for n in range(1, 3501):
            if (4 * h * n - N * n - N * h != 0) and (N * h * n) % (4 * h * n - N * n - N * h) == 0:
                print(h, n, (N * h * n) // (4 * h * n - N * n - N * h))
                return

solve()
```
Note: The code is written in Python 3.x and uses the `math` module for mathematical operations. The `input()` function is used to read the input from the user, and the `print()` function is used to print the output. The `range()` function is used to iterate over the values of `h` and `n`. The `//` operator is used for integer division.</s>
