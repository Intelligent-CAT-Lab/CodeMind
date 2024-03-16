<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
					if(i!=j && !eq[j] && str[i].matches(".*?"+str[j]+".*?"))	eq[j]=true;
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
[/INST]
```python
import sys

def init():
    global N
    N = int(input())
    if N == 0:
        return
    solve()

def solve():
    strs = []
    for i in range(N):
        strs.append(input())
    eq = [False] * N
    for i in range(N):
        if eq[i]:
            continue
        for j in range(N):
            if i != j and not eq[j]:
                if strs[i].find(strs[j]) != -1:
                    eq[j] = True
    strs2 = []
    for i in range(N):
        if not eq[i]:
            strs2.append(strs[i])
    N2 = len(strs2)
    len = [[0] * N2 for _ in range(N2)]
    for i in range(N2):
        for j in range(N2):
            if i == j:
                continue
            offset = 0
            for offset in range(len[j][i]):
                if strs2[j].startswith(strs2[i][offset:]):
                    break
            len[j][i] = len[j][i] - offset
    dp = [[sys.maxsize] * N2 for _ in range(1 << N2)]
    for i in range(1 << N2):
        for j in range(N2):
            dp[i][j] = sys.maxsize
    for i in range(N2):
        dp[1 << i][i] = len[i][i]
    for i in range(1 << N2):
        for j in range(N2):
            if dp[i][j] >= sys.maxsize:
                continue
            for k in range(N2):
                if (i & (1 << k)) > 0:
                    continue
                new_idx = i | (1 << k)
                dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len[j][k])
    ans = sys.maxsize
    for i in range(N2):
        ans = min(ans, dp[((1 << N2) - 1)][i])
    print(ans)

if __name__ == "__main__":
    init()
```</s>
