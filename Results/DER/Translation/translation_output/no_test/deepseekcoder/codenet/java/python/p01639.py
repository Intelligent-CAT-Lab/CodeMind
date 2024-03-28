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
import sys

# MLE
class p01639:
    def __init__(self):
        self.sc = sys.stdin

    def run(self):
        self.n = int(self.sc.readline())
        self.k = int(self.sc.readline()) - 1
        self.x0 = int(self.sc.readline())
        self.solve()

    def solve(self):
        if self.x0 == 0:
            self.println("0")
            return

        x = self.x0
        s = 10000
        count = [0]*s
        M = 10**12
        offset = 2**63
        for i in range(self.n):
            at = int((x + offset) * M) % s
            count[at] += 1
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17

        sum = 0
        length = -1
        target = -1
        for i in range(s):
            if sum <= self.k < sum + count[i]:
                target = i
                length = count[i]
                break
            sum += count[i]

        now = 0
        is_ = [0]*length
        x = self.x0
        for i in range(self.n):
            at = int((x + offset) * M) % s
            if at == target:
                is_[now] = x
                now += 1
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17

        is_.sort()
        self.println(str(is_[self.k - sum]))

    def println(self, s):
        print(s)


if __name__ == "__main__":
    p01639().run()
```

Please note that Python's `sys.stdin.readline()` is used instead of Java's `sc.nextInt()` and `sc.nextLong()`. Also, Python's `print()` function is used instead of Java's `System.out.println()`. The `%` operator is used instead of Java's `%` for modulo operation. The `**` operator is used instead of Java's `Math.pow()` for exponentiation. The `range()` function is used instead of Java's `for` loop for the range of numbers. The `sort()` function is used instead of Java's `Arrays.sort()` for sorting the list.
<|EOT|>
