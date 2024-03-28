<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
YesM

```
n,m,k=map(int,input().split())
ans="No"
for i in range(n//2+1):
  for j in range(m):
    o=i*j+(m-j)*(n-i)
    x=n*m-o
    if o==k or x==k:
      ans="Yes"
print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int o=0,x=0;
        for(int i=0;i<=n/2;i++){
            o=i*m+(m-1)*(n-i);
            x=n*m-o;
            if(o==k || x==k){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
```
'''
<|endoftext|>
