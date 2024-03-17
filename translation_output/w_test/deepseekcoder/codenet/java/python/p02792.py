<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
25

Expected output:
17


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

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline().strip())

    # Initialize the array
    array = [[0]*10 for _ in range(10)]

    # Count the number of times each digit pair appears
    for i in range(1, n+1):
        head = int(str(i)[0])
        tail = i % 10
        array[head][tail] += 1

    # Initialize the result
    result = 0

    # Count the number of times each digit pair appears in the reversed order
    for i in range(1, n+1):
        head = i % 10
        tail = int(str(i)[0])
        if tail == 0:
            continue
        result += array[tail][head]

    # Print the result
    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, counts the number of times each digit pair appears in the range from 1 to the input number, counts the number of times each digit pair appears in the reversed order, and prints the result.
<|EOT|>
