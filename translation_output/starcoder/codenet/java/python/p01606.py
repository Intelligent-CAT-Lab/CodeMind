<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import sys

class p01606:
	def __init__(self):
		self.sc = sys.stdin
		self.INF = 1<<28
		self.EPS = 1e-12
		self.n = 0
		self.w = 0
		self.flag = []
		self.count = []
		self.sum = 0
		self.left = 0
		self.right = 0

	def run(self):
		self.n = int(self.sc.readline())
		self.w = int(self.sc.readline())
		self.solve()

	def solve(self):
		self.flag = [False]*(self.n+1)
		self.count = [0]*(self.n+1)
		self.sum = 0
		self.left = 1
		self.right = self.w+1
		for i in range(1, self.w):
			for k in range(1, i+1):
				if i%k == 0:
					self.count[k] += 1
					self.update(k)
					if i/k!= k:
						self.count[i/k] += 1
						self.update(i/k)
		for i in range(0, self.n-self.w+1):
			self.left = i+1
			self.right = i+self.w+1
			for k in range(1, i+1):
				if i%k == 0:
					self.count[k] -= 1
					self.update(k)
					if i/k!= k:
						self.count[i/k] -= 1
						self.update(i/k)
			for k in range(1, i+self.w+1):
				if (i+self.w)%k == 0:
					self.count[k] += 1
					self.update(k)
					if (i+self.w)/k!= k:
						self.count[(i+self.w)/k] += 1
						self.update((i+self.w)/k)
			self.update(self.left-1)
			self.update(self.right-1)
			print(self.sum+(i<self.n-self.w?" ":"\n"))

	def update(self, i):
		det = self.left<=i and i<self.right
		if self.flag[i] and not det and self.count[i]<2:
			self.flag[i] = False
			self.sum -= 1
		if not self.flag[i] and (det or self.count[i]>=2):
			self.flag[i] = True
			self.sum += 1

	def debug(self, *os):
		print(*os)

	def print(self, s):
		print(s, end='')

	def println(self, s):
		print(s)

p01606().run()
```
'''
<|endoftext|>
