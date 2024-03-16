<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

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
Note: The `map` function is used to convert the input from a string to an integer. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` function is used to split the input into a list of strings, where each string represents a single number. The `int` function is used to convert each string to an integer.</s>
