<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
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

@@ Response
```python
import sys
import re

def solve(N, str):
    eq = [False] * N
    str2 = []
    for i in range(N):
        if eq[i]:
            continue
        for j in range(N):
            if i != j and not eq[j] and re.search(str[j], str[i]):
                eq[j] = True
    for i in range(N):
        if not eq[i]:
            str2.append(str[i])
    N2 = len(str2)

    len = [[0] * N2 for _ in range(N2)]
    for i in range(N2):
        for j in range(N2):
            if i == j:
                continue
            offset = 0
            l = len(str2[i])
            for offset in range(l):
                if str2[j].startswith(str2[i][offset:]):
                    break
            len[i][j] = len(str2[j]) - (l - offset)

    dp = [[float('inf')] * N2 for _ in range(1 << N2)]
    for i in range(N2):
        dp[1 << i][i] = len(str2[i])
    for i in range(1 << N2):
        for j in range(N2):
            if dp[i][j] == float('inf'):
                continue
            for k in range(N2):
                if (i & (1 << k)) > 0:
                    continue
                newIdx = i | (1 << k)
                dp[newIdx][k] = min(dp[newIdx][k], dp[i][j] + len[j][k])

    ans = float('inf')
    tmp = (1 << N2) - 1
    for i in range(N2):
        ans = min(ans, dp[tmp][i])
    return ans

def main():
    N = int(sys.stdin.readline())
    str = [sys.stdin.readline().strip() for _ in range(N)]
    print(solve(N, str))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input, calls the `solve` function, and prints the result. The `solve` function implements the logic of the Java code.<｜end▁of▁sentence｜>
