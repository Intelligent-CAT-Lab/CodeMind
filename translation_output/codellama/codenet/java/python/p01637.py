<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import math
import sys

M = int(input())
rD = int(input())
rR = int(input())
cD = int(input())
cR = int(input())

def solve():
    max_value = -1
    D0 = (100 * cD + rD - 1) // rD
    C0 = (100 * cR + rR - 1) // rR
    for i in range(100):
        for j in range(100):
            change_D = D0 + i
            change_R = C0 + j
            jpn = M - change_D - change_R
            if jpn < 0:
                continue
            rem_D = change_D * rD // 100 - cD
            rem_R = change_R * rR // 100 - cR
            jpn += rem_D * 100 // rD + rem_R * 100 // rR
            max_value = max(max_value, jpn)
    print(max_value)

solve()
```
This is the Python code equivalent to the Java code you provided. It uses the same logic and variables as the Java code, but with Python syntax.

Note that in Python, you don't need to import the `java.util` package, as it is not used in the code. Also, the `static` keyword is not used in Python, so you can remove it from the imports.</s>
