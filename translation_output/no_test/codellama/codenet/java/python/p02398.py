<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```
import sys

x, y, z = map(int, sys.stdin.readline().split())

t = 0
for i in range(x, y+1):
    if z % i == 0:
        t += 1

print(t)
```
Note: The `map` function is used to convert the input from strings to integers, and the `range` function is used to create a range of numbers from `x` to `y+1`. The `sys.stdin.readline()` function is used to read a line of input from the user, and the `split()` method is used to split the input into a list of strings.</s>
