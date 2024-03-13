<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
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

This Python code does the same thing as the Java code. It reads three integers from the standard input, then it iterates over a counter `cnt` until it reaches `c`. For each iteration, it increments `i` and adds `a` to `cnt`. If `i` is divisible by 7, it adds `b` to `cnt`. Finally, it prints the value of `i`.<｜end▁of▁sentence｜>
