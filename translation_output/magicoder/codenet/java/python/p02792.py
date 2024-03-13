<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class p02792 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// å¥å
		int n = sc.nextInt();
		
		// è¨ç®
		int result = 0;
		int[][] array = new int[10][10];
		for(int i = 1; i <= n; i++){
		    int head = Integer.valueOf(String.valueOf(i).substring(0,1));
		    int tail = i%10;
		    array[head][tail]++;
		}
		
		int keta = String.valueOf(n).length();
		for(int i = 1; i <= n; i++){
		    int head = Integer.valueOf(String.valueOf(i).substring(0,1));
		    int tail = i%10;
		    if(tail == 0) continue;
		    result += array[tail][head];
		}
		
		// åºå
		System.out.println(result);
	}
}



```

@@ Response
```python
import sys

def main():
    n = int(sys.stdin.readline())

    # å¥å
    result = 0
    array = [[0]*10 for _ in range(10)]
    for i in range(1, n+1):
        head = int(str(i)[0])
        tail = i % 10
        array[head][tail] += 1

    for i in range(1, n+1):
        head = int(str(i)[0])
        tail = i % 10
        if tail == 0:
            continue
        result += array[tail][head]

    # åºå
    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, creates a 2D array, and then calculates the result. The result is printed to the standard output.<｜end▁of▁sentence｜>
