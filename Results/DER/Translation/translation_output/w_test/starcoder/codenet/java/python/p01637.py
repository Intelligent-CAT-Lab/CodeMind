<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
M r

Expected output:
9333


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

python code:<fim_suffix><fim_middle>

```python
import sys

def solve(M, rD, rR, cD, cR):
    D0 = (100*cD+rD-1)/rD
    C0 = (100*cR+rR-1)/rR
    max = -1
    for i in range(100):
        for j in range(100):
            changeD = D0+i
            changeR = C0+j
            jpn = M-changeD-changeR
            if jpn < 0:
                continue
            remD = changeD*rD/100-cD
            remR = changeR*rR/100-cR
            jpn += remD*100/rD+remR*100/rR
            max = max(max, jpn)
    return max

def main():
    M, rD, rR, cD, cR = map(int, sys.stdin.readline().split())
    print(solve(M, rD, rR, cD, cR))

if __name__ == '__main__':
    main()
```
<|endoftext|>
