<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
n k x0

Expected output:
-768720241707614171


```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// MLE
public class p01639{
	Scanner sc=new Scanner(System.in);

	int n, k;
	long x0;

	void run(){
		n=sc.nextInt();
		k=sc.nextInt()-1;
		x0=sc.nextLong();
		solve();
	}

	void solve(){
		if(x0==0){
			println("0");
			return;
		}

		long x=x0;
		int s=(int)1e4;
		int[] count=new int[s];
		double offset=pow(2, 63), M=s/pow(2, 64);
		for(int i=0; i<n; i++){
			int at=(int)((x+offset)*M);
			if(at<0){
				at=0;
			}
			if(at>=s){
				at=s-1;
			}
			count[at]++;
			x^=x<<13;
			x^=x>>>7;
			x^=x<<17;
		}

		int sum=0, length=-1, target=-1;
		for(int i=0; i<s; i++){
			if(sum<=k&&k<sum+count[i]){
				target=i;
				length=count[i];
				break;
			}
			sum+=count[i];
		}

		int now=0;
		long[] is=new long[length];
		x=x0;
		for(int i=0; i<n; i++){
			int at=(int)((x+offset)*M);
			if(at<0){
				at=0;
			}
			if(at>=s){
				at=s-1;
			}
			if(at==target){
				is[now++]=x;
			}
			x^=x<<13;
			x^=x>>>7;
			x^=x<<17;
		}
		sort(is);
		println(is[k-sum]+"");
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new p01639().run();
	}
}
```
[/INST]
```python
import sys

n, k, x0 = map(int, input().split())

def solve():
    if x0 == 0:
        print("0")
        return

    x = x0
    s = 1 << 40
    count = [0] * s
    offset = 1 << 63
    M = s // (1 << 64)
    for i in range(n):
        at = (x + offset) * M
        if at < 0:
            at = 0
        if at >= s:
            at = s - 1
        count[at] += 1
        x ^= x << 13
        x ^= x >> 7
        x ^= x << 17

    sum = 0
    length = -1
    target = -1
    for i in range(s):
        if sum <= k and k < sum + count[i]:
            target = i
            length = count[i]
            break
        sum += count[i]

    now = 0
    is = [0] * length
    x = x0
    for i in range(n):
        at = (x + offset) * M
        if at < 0:
            at = 0
        if at >= s:
            at = s - 1
        if at == target:
            is[now] = x
            now += 1

        x ^= x << 13
        x ^= x >> 7
        x ^= x << 17

    is.sort()
    print(is[k - sum])

if __name__ == "__main__":
    solve()
```</s>
