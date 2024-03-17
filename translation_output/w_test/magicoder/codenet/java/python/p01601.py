<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
13

Expected output:
11


```

import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class p01601 {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;;i++) {
			if( isPalin(Integer.toString(n-i)) ) {
				System.out.println(n-i);
				break;
			}
			if( isPalin(Integer.toString(n+i)) ) {
				System.out.println(n+i);
				break;
			}
		}
	}
	
	boolean isPalin(String s) {
		for(int i=0;i<s.length()/2;i++) 
			if( s.charAt(i) != s.charAt(s.length()-i-1) ) return false;
		return true;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new p01601().run();
	}
}
```

@@ Response
```python
def is_palin(n):
    return str(n) == str(n)[::-1]

def run(n):
    for i in range(n):
        if is_palin(n-i):
            return n-i
        if is_palin(n+i):
            return n+i

def main():
    n = int(input())
    print(run(n))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It checks if the number is a palindrome by converting the number to a string and comparing it to its reverse. If it is, it returns the number. If not, it increments or decrements the number by 1 and checks again. The `main` function reads the input number and calls the `run` function.<｜end▁of▁sentence｜>
