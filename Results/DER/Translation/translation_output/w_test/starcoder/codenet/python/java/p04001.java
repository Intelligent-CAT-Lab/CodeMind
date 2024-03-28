<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
125

Expected output:
176


```
def dfs(i,sep,s,tot):
    n = len(s)
    i += 1

    # ææ·±é¨ã¾ã§å°éããæ
    if i == n:
        ans = 0
        if len(sep)>1:
            for j in range(len(sep)-1):
                ans += int(s[sep[j]:sep[j+1]])
        ans += int(s[sep[-1]:])
        return ans

    # içªç®ã«+ãå¥ããæ
    sep.append(i)
    tot += dfs(i,sep,s, 0)

    # içªç®ã«+ãå¥ããªãæ
    sep.pop()
    tot += dfs(i,sep,s, 0)

    return tot

s = input()
print(dfs(0,[0],s,0))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sep = new int[n];
        sep[0] = 0;
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i=1;i<n;i++){
            sep[i] = i;
            dp[i] = 0;
            for(int j=i;j>=0;j--){
                dp[i] += Integer.parseInt(String.valueOf(n).substring(j,i+1));
                sep[i] = j;
            }
        }
        System.out.println(dp[n-1]);
    }
}
```
<|endoftext|>
