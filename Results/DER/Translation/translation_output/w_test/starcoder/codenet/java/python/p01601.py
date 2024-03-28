<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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
			if( s.charAt(i)!= s.charAt(s.length()-i-1) ) return false;
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

python code:<fim_suffix><fim_middle>

```python
import sys

def isPalin(s):
	for i in range(len(s)/2):
		if s[i]!= s[len(s)-i-1]:
			return False
	return True

def run():
	n = int(sys.stdin.readline())
	for i in range(n):
		if isPalin(str(n-i)) or isPalin(str(n+i)):
			print n-i
			break

run()
```
<|endoftext|>
