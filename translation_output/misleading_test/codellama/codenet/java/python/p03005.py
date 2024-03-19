<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
34

```
import java.util.*;
public class p03005{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(k == 1){
			ans = 0;
		}else{
			ans = n - k;
		}
		
		System.out.println(ans);
	}
}

```
[/INST]
```
import sys

n, k = map(int, sys.stdin.readline().split())

if k == 1:
    ans = 0
else:
    ans = n - k

print(ans)
```
This code reads the input from the user, which is a line containing two integers `n` and `k`, separated by a space. It then calculates the result based on the value of `k`, and prints it to the console.

Note that in Python, we don't need to create a `Scanner` object to read input from the user, we can simply use the `sys.stdin.readline()` method to read a line of input, and then split it into two integers using the `split()` method.</s>
