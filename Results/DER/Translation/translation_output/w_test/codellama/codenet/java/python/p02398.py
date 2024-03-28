<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 14 80

Expected output:
3


```
import java.util.Scanner;

public class p02398 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    int t = 0;
	    for (int i = x; i <= y; i++) {
	    	if (z % i == 0)
	    		t++;
	    } System.out.println(t);
     }
}


```
[/INST]
```
import sys

def main():
    x, y, z = map(int, sys.stdin.readline().split())
    t = 0
    for i in range(x, y+1):
        if z % i == 0:
            t += 1
    print(t)

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input strings to integers, and the `range` function is used to create a range of numbers from `x` to `y+1`. The `if` statement is used to check if `z` is divisible by `i`, and if it is, `t` is incremented. Finally, `t` is printed.</s>
