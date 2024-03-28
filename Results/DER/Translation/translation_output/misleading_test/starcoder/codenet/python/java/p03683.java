<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-80

```
buf=input().split()
N=int(buf[0])
M=int(buf[1])

thres=10**9+7

if abs(N-M)==1:
    N=min(N,M)
    retVal=1
    for i in range(1,N+1):
        retVal*=(i**2)
        if retVal>=thres:
            retVal=retVal%thres
    retVal*=(N+1)
    if retVal>=thres:
        retVal=retVal%thres
    print(retVal) 
elif N==M:
    retVal=2
    for i in range(1,N+1):
        retVal*=(i**2)
        if retVal>=thres:
            retVal=retVal%thres
    print(retVal)
else:
    print(0)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int thres=1000000007;
        if(Math.abs(N-M)==1){
            N=Math.min(N,M);
            int retVal=1;
            for(int i=1;i<=N;i++){
                retVal=retVal*(i*i);
                retVal=retVal%thres;
            }
            retVal=retVal*(N+1);
            retVal=retVal%thres;
            System.out.println(retVal);
        }
        else if(N==M){
            int retVal=2;
            for(int i=1;i<=N;i++){
                retVal=retVal*(i*i);
                retVal=retVal%thres;
            }
            System.out.println(retVal);
        }
        else{
            System.out.println(0);
        }
    }
}
```
'''
<|endoftext|>
