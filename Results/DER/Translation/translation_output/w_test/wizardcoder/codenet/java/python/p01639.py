Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

class p01639:
    def __init__(self):
        self.sc = Scanner(System.in)

    def run(self):
        self.n = self.sc.nextInt()
        self.k = self.sc.nextInt() - 1
        self.x0 = self.sc.nextLong()
        self.solve()

    def solve(self):
        if self.x0 == 0:
            self.println("0")
            return

        x = self.x0
        s = 10000
        count = [0] * s
        offset = pow(2, 63)
        M = s / pow(2, 64)
        for i in range(self.n):
            at = int((x + offset) * M)
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
            if sum <= self.k and self.k < sum + count[i]:
                target = i
                length = count[i]
                break
            sum += count[i]

        if length == -1:
            self.println("-1")
            return

        now = 0
        is = [0] * length
        x = self.x0
        for i in range(self.n):
            at = int((x + offset) * M)
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
        self.println(str(is[self.k - sum]))

    def println(self, s):
        print(s)

p01639().run()
```<|endoftext|>
