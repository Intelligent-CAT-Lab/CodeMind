<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 0 10

Expected output:
4


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

@@ Response
```python
# Python code

# Read input from user
a, b, c = map(int, input().split())

i = 0
cnt = 0

while cnt < c:
    i += 1
    cnt += a
    if i % 7 == 0:
        cnt += b

print(i)
```

This Python code does the same thing as the Java code. It reads three integers from the user, then it enters a loop where it increments `i` and `cnt` by `a`. If `i` is divisible by 7, it also increments `cnt` by `b`. The loop continues until `cnt` is greater than or equal to `c`. Finally, it prints the value of `i`.<｜end▁of▁sentence｜>
