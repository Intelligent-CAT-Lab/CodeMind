<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Change
public class p01637{
	Scanner sc=new Scanner(System.in);

	long M;
	int rD, rR;
	long cD, cR;

	void run(){
		M=sc.nextLong();
		rD=sc.nextInt();
		rR=sc.nextInt();
		cD=sc.nextLong();
		cR=sc.nextLong();
		solve();
	}

	void solve(){
		long max=-1;
		long D0=(100*cD+rD-1)/rD, C0=(100*cR+rR-1)/rR;
		for(int i=0; i<100; i++){
			for(int j=0; j<100; j++){
				long changeD=D0+i, changeR=C0+j;
				long jpn=M-changeD-changeR;
				if(jpn<0){
					continue;
				}
				long remD=changeD*rD/100-cD;
				long remR=changeR*rR/100-cR;
				jpn+=remD*100/rD+remR*100/rR;
				max=max(max, jpn);
			}
		}
		println(max+"");
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new p01637().run();
	}
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

class p01637:
    def __init__(self):
        self.M = int(sys.stdin.readline())
        self.rD, self.rR = map(int, sys.stdin.readline().split())
        self.cD, self.cR = map(int, sys.stdin.readline().split())

    def solve(self):
        max_jpn = -1
        D0 = (100*self.cD+self.rD-1)//self.rD
        C0 = (100*self.cR+self.rR-1)//self.rR
        for i in range(100):
            for j in range(100):
                change_D = D0 + i
                change_R = C0 + j
                jpn = self.M - change_D - change_R
                if jpn < 0:
                    continue
                rem_D = change_D*self.rD//100 - self.cD
                rem_R = change_R*self.rR//100 - self.cR
                jpn += rem_D*100//self.rD + rem_R*100//self.rR
                max_jpn = max(max_jpn, jpn)
        print(max_jpn)

if __name__ == "__main__":
    p01637().solve()
```

Please note that Python does not have a built-in `println` function like Java. Instead, it uses the `print` function. Also, Python does not have a built-in `max` function like Java. Instead, it uses the `max` function from the `builtins` module.<｜end▁of▁sentence｜>
