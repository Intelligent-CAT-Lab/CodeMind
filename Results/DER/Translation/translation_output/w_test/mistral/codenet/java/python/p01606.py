<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 2

Expected output:
2 3 3 3 3 3 3 3 3


```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class p01606{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, w;

	void run(){
		n=sc.nextInt();
		w=sc.nextInt();
		solve();
	}

	boolean[] flag;
	int[] count;
	int sum, left, right;

	void solve(){
		flag=new boolean[n+1];
		count=new int[n+1];
		sum=0;
		left=1;
		right=w+1;
		for(int i=1; i<w; i++){
			for(int k=1; k*k<=i; k++){
				if(i%k==0){
					count[k]++;
					update(k);
					if(i/k!=k){
						count[i/k]++;
						update(i/k);
					}
				}
			}
		}
		for(int i=0; i<n-w+1; i++){
			left=i+1;
			right=i+w+1;
			for(int k=1; k*k<=i; k++){
				if(i%k==0){
					count[k]--;
					update(k);
					if(i/k!=k){
						count[i/k]--;
						update(i/k);
					}
				}
			}
			for(int k=1; k*k<=i+w; k++){
				if((i+w)%k==0){
					count[k]++;
					update(k);
					if((i+w)/k!=k){
						count[(i+w)/k]++;
						update((i+w)/k);
					}
				}
			}
			update(left-1);
			update(right-1);
//			debug("i", i, "i+w-1", i+w-1);
//			debug("count", count);
//			debug("flag", flag);
//			debug("sum", sum);
//			debug(sum);
//			debug();
			print(sum+(i<n-w?" ":"\n"));
		}
		// iã®ç´æ°ãæ¸ã£ã¦
		// i+wã®ç´æ°ãå¢ãã
		// iãç¢ºå®ãããªããªã£ã
		// i+wãç¢ºå®ãã
	}

	void update(int i){
		boolean det=left<=i&&i<right;
		if(flag[i]&&!det&&count[i]<2){
			flag[i]=false;
			sum--;
		}
		if(!flag[i]&&(det||count[i]>=2)){
			flag[i]=true;
			sum++;
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new p01606().run();
		System.out.flush();
	}
}
```
[/INST]
```python
import sys

n, w = map(int, input().split())

def solve(n, w):
    flag = [False] * (n+1)
    count = [0] * (n+1)
    sum = 0
    left = 1
    right = w+1
    for i in range(1, w+1):
        for k in range(1, i+1):
            if i % k == 0:
                count[k] += 1
                update(k)
                if i // k != k:
                    count[i//k] += 1
                    update(i//k)
    for i in range(1, n-w+1):
        left = i+1
        right = i+w+1
        for k in range(1, i+w+1):
            if (i+w) % k == 0:
                count[k] += 1
                update(k)
                if (i+w) // k != k:
                    count[(i+w)//k] += 1
                    update((i+w)//k)
        update(left-1)
        update(right-1)
    print(sum)

def update(i):
    det = left <= i and i < right
    if flag[i] and not det and count[i] < 2:
        flag[i] = False
        sum -= 1
    elif not flag[i] and (det or count[i] >= 2):
        flag[i] = True
        sum += 1

if __name__ == "__main__":
    solve(n, w)
```</s>
