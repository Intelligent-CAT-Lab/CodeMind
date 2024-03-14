<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys
import math

class p01601:

    INF = 1 << 28
    EPS = 1e-10

    def run(self):
        n = int(input())
        for i in range(sys.maxsize):
            if self.isPalin(str(n-i)):
                print(n-i)
                break
            if self.isPalin(str(n+i)):
                print(n+i)
                break

    def isPalin(self, s):
        for i in range(len(s)//2):
            if s[i] != s[-i-1]:
                return False
        return True

    def debug(self, *os):
        print(os)

if __name__ == "__main__":
    p01601().run()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then finds the nearest palindrome by adding or subtracting from the input number. The `isPalin` method checks if a string is a palindrome by comparing the characters at the beginning and end of the string, moving inward. The `run` method is the main loop that finds the nearest palindrome. The `debug` method is used for debugging, but it's not used in the main program.
<|EOT|>
