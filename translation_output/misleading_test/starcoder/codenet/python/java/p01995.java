<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
acpc

Expected output:
89

```
def main():
    from bisect import bisect_left as bl
    from bisect import bisect_right as br
    s=input()
    alpha="abcdefghijklmnopqrstuvwxyz"
    l=len(s)
    alpha2={j:i for i,j in enumerate(alpha)}
    memo=[[] for _ in [0]*26]
    mod=10**9+7
    for i in range(l):
        memo[alpha2[s[i]]].append(i)
    dp=[[0]*(l+1) for _ in range(l+1)]
    dp[0][l]=1
    ans=0
    for i in range(l):
        for j in range(i+1,l+1):
            p=dp[i][j]
            if p==0:
                continue
            for k in range(26):
                x=bl(memo[k],i)
                y=br(memo[k],j-1)-1
                if x>y:
                    continue
                ans+=p
                if x<y:
                    mx,my=memo[k][x],memo[k][y]
                    dp[mx+1][my]=(dp[mx+1][my]+p)%mod
            ans=ans%mod
    ans=(ans+sum([sum([i for i in j])%mod for j in dp])+mod-1)%mod
    print(ans)
    
if __name__=='__main__':
    main()

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int mod=1000000007;
        int ans=0;
        int[][] dp=new int[l+1][l+1];
        for(int i=0;i<l;i++){
            dp[i][i]=1;
        }
        for(int i=l-1;i>=0;i--){
            for(int j=i+1;j<=l;j++){
                int p=dp[i][j];
                if(p==0) continue;
                for(int k=0;k<26;k++){
                    int x=Arrays.binarySearch(memo[k],i);
                    int y=Arrays.binarySearch(memo[k],j-1);
                    if(x>y) continue;
                    ans=(ans+p)%mod;
                    if(x<y){
                        int mx=memo[k][x];
                        int my=memo[k][y];
                        dp[mx+1][my]=(dp[mx+1][my]+p)%mod;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
