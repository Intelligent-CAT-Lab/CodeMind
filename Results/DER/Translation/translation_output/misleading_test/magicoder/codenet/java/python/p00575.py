<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    i = 0
    cnt = 0
    while cnt < c:
        i += 1
        cnt += a
        if i % 7 == 0:
            cnt += b
    print(i)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, and then it iterates over the integers until the total count (cnt) is greater than or equal to c. For each iteration, it increments the count by a and checks if the current iteration is a multiple of 7. If it is, it increments the count by b. The final value of i is then printed.<｜end▁of▁sentence｜>
