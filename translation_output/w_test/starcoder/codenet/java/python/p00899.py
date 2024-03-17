<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
16


```
import java.util.*;
import static java.lang.Math.*;
public class p00899 {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new p00899().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new AOJ1320(), "RUN", STACK_SIZE).start();
	}
	
	class AOJ1320 implements Runnable{
		AOJ1320(){}
		@Override public void run(){
			while(sc.hasNext()){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		
		int N,N2;
		final int INF=1<<29;
		
		void solve(){
			String[] str=new String[N];
			for(int i=0; i<N; ++i)	str[i]=sc.next();
			
			boolean[] eq=new boolean[N];
			for(int i=0; i<N; ++i){
				if(eq[i])	continue;
				for(int j=0; j<N; ++j){
					if(i!=j &&!eq[j] && str[i].matches(".*?"+str[j]+".*?"))	eq[j]=true;
				}
			}
			ArrayList<String> str2=new ArrayList<String>();
			for(int i=0; i<N; ++i)if(!eq[i])	str2.add(str[i]);
			N2=str2.size();
			
			int[][] len=new int[N2][N2];
			for(int i=0; i<N2; ++i){
				for(int j=0; j<N2; ++j){
					if(i==j)	continue;
					int offset=0, l=str2.get(i).length();
					for( ; offset<l; ++offset){
						if( str2.get(j).startsWith( str2.get(i).substring(offset) ) )	break;
					}
					len[i][j]=str2.get(j).length()-(l-offset);
				}
			}
			
			int[][] dp=new int[1<<N2][N2];
			for(int i=0; i<(1<<N2); ++i)for(int j=0; j<N2; ++j)dp[i][j]=INF;
			for(int i=0; i<N2; ++i)	dp[1<<i][i]=str2.get(i).length();
			for(int i=0; i<(1<<N2); ++i){
				for(int j=0; j<N2; ++j){
					if(dp[i][j]>=INF)	continue;
					for(int k=0; k<N2; ++k){
						if( (i&(1<<k)) > 0 )	continue;
						int newIdx=i|(1<<k);
						dp[newIdx][k]=min(dp[newIdx][k], dp[i][j]+len[j][k]);
					}
				}
			}
			
			int ans=INF, tmp=(1<<N2)-1;
			for(int i=0; i<N2; ++i)	ans=min(ans,dp[tmp][i]);
			System.out.println(ans);
		}
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

class AOJ1320:
    def __init__(self):
        self.sc = sys.stdin
        self.solve()

    def solve(self):
        while True:
            N = int(self.sc.readline())
            if N == 0:
                break
            self.N = N
            self.N2 = 0
            self.INF = 1 << 29
            self.str = []
            self.eq = []
            self.str2 = []
            self.len = []
            self.dp = []
            self.ans = self.INF
            self.tmp = 0
            self.init()
            self.solve2()
            print(self.ans)

    def init(self):
        for i in range(self.N):
            self.str.append(self.sc.readline().strip())
        for i in range(self.N):
            self.eq.append(False)
        for i in range(self.N):
            if self.eq[i]:
                continue
            for j in range(self.N):
                if i!= j and not self.eq[j] and self.str[i].find(self.str[j])!= -1:
                    self.eq[j] = True
        for i in range(self.N):
            if not self.eq[i]:
                self.str2.append(self.str[i])
        self.N2 = len(self.str2)
        for i in range(self.N2):
            for j in range(self.N2):
                if i == j:
                    continue
                offset = 0
                l = len(self.str2[i])
                for offset in range(l):
                    if self.str2[j].find(self.str2[i][offset:])!= -1:
                        break
                self.len.append(len(self.str2[j]) - (l - offset))
        for i in range(1 << self.N2):
            for j in range(self.N2):
                self.dp.append([self.INF] * self.N2)
        for i in range(self.N2):
            self.dp[1 << i][i] = len(self.str2[i])
        for i in range(1 << self.N2):
            for j in range(self.N2):
                if self.dp[i][j] >= self.INF:
                    continue
                for k in range(self.N2):
                    if (i & (1 << k)) > 0:
                        continue
                    newIdx = i | (1 << k)
                    self.dp[newIdx][k] = min(self.dp[newIdx][k], self.dp[i][j] + self.len[j * self.N2 + k])
        for i in range(1 << self.N2):
            for j in range(self.N2):
                if self.dp[i][j] >= self.INF:
                    continue
                self.tmp = i
                self.ans = min(self.ans, self.dp[self.tmp][j])

    def solve2(self):
        pass


if __name__ == '__main__':
    AOJ1320()
```
'''
<|endoftext|>
