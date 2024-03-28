Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
0
0
0
0
0
1
0
0
0
0
3
0
0
0
0
0
3
3
0
0


```
import collections
n=int(input())
cnt=[]
for x in range(1,101):
  for y in range(1,101):
    for z in range(1,101):
      a=x**2+y**2+z**2+x*y+y*z+z*x
      if a<=n:
        cnt.append(a)
c=collections.Counter(cnt)
for i in range(1,n+1):
  print(c[i])
```

### Response:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][][] dp=new int[101][101][101];
        for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j++){
                for(int k=1;k<=100;k++){
                    dp[i][j][k]=i*i+j*j+k*k+i*j+j*k+k*i;
                }
            }
        }
        int[] cnt=new int[n+1];
        for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j++){
                for(int k=1;k<=100;k++){
                    if(dp[i][j][k]<=n){
                        cnt[dp[i][j][k]]++;
                    }
                }
            }
        }
        for(int i=1;i<=n;i++){
            System.out.println(cnt[i]);
        }
    }
}
```<|endoftext|>
