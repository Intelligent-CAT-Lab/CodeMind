Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N = int ( input ( ) )
def aaa ( n ) :
    if int ( n ) > N :
        return 0
    ans = 1 if set ( str ( int ( n ) ) ) == { '7', '5', '3' } else 0
    for i in '753' :
        ans += aaa ( n + i )
    return ans
print ( aaa ( '0' ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int[][] dp = new int[N+1][10];
        for(int i=0;i<=N;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans = helper(N,dp);
        System.out.println(ans);
    }

    public static int helper(int n,int[][] dp){
        if(n>N){
            return 0;
        }
        if(dp[n][7]!=-1){
            return dp[n][7];
        }
        int ans=0;
        if(n==0){
            ans=1;
        }else if(n%7==0){
            ans=1;
        }else{
            ans=0;
        }
        for(int i=0;i<3;i++){
            ans+=helper(n+i,dp);
        }
        dp[n][7]=ans;
        return ans;
    }
}
```<|endoftext|>
