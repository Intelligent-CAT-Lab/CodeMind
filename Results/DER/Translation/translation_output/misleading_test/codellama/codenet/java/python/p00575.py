<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 0 10

Expected output:
-44

```
import java.util.Scanner;
class p00575{
    public static void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
        int c = sc.nextInt();
	int i = 0,cnt = 0; 
	while(cnt < c){
	    i++;
	    cnt += a;
	    if(i % 7 == 0){cnt += b;}
	    
	}
	System.out.println(i);
    }
}

```
[/INST]
```
import sys

a, b, c = map(int, sys.stdin.readline().split())
i = 0
cnt = 0
while cnt < c:
    i += 1
    cnt += a
    if i % 7 == 0:
        cnt += b

print(i)
```
This code reads the input from the standard input and uses the `map` function to convert the input strings to integers. It then initializes the variables `i` and `cnt` to 0 and starts a loop that increments `i` by 1 and adds `a` to `cnt` for each iteration. If `i` is divisible by 7, it adds `b` to `cnt`. The loop continues until `cnt` is greater than or equal to `c`. Finally, it prints the value of `i`.</s>
