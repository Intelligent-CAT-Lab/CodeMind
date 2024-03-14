<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

class p01637:
    def __init__(self):
        self.sc = sys.stdin

    def run(self):
        self.M = int(self.sc.readline())
        self.rD = int(self.sc.readline())
        self.rR = int(self.sc.readline())
        self.cD = int(self.sc.readline())
        self.cR = int(self.sc.readline())
        self.solve()

    def solve(self):
        max_val = -1
        D0 = (100*self.cD+self.rD-1)//self.rD
        R0 = (100*self.cR+self.rR-1)//self.rR
        for i in range(100):
            for j in range(100):
                changeD = D0 + i
                changeR = R0 + j
                jpn = self.M - changeD - changeR
                if jpn < 0:
                    continue
                remD = changeD*self.rD//100 - self.cD
                remR = changeR*self.rR//100 - self.cR
                jpn += remD*100//self.rD + remR*100//self.rR
                max_val = max(max_val, jpn)
        self.println(str(max_val))

    def println(self, s):
        print(s)

if __name__ == "__main__":
    p01637().run()
```

This Python code does the same thing as the Java code. It reads input from the standard input, calculates the maximum amount of Japanese yen that can be obtained, and prints the result. The calculation is based on the given rates and costs.
<|EOT|>
