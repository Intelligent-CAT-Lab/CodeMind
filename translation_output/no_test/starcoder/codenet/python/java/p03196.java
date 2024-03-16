<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n,p=map(int,input().split())

def factorization(n):
    arr = []
    temp = n
    for i in range(2, int(-(-n**0.5//1))+1):
        if temp%i==0:
            cnt=0
            while temp%i==0:
                cnt+=1
                temp //= i
            arr.append([i, cnt])

    if temp!=1:
        arr.append([temp, 1])

    if arr==[]:
        arr.append([n, 1])

    return arr

l=factorization(p)
ans=1
for i in range(len(l)):
    if l[i][1]>=n:
        ans*=l[i][0]**(l[i][1]//n)
print(ans)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int ans=1;
        int[] arr=new int[n];
        int temp=p;
        for(int i=2;i<=Math.sqrt(p);i++){
            int cnt=0;
            while(temp%i==0){
                cnt++;
                temp/=i;
            }
            if(cnt>0)
                arr[cnt-1]=i;
        }
        if(temp!=1)
            arr[n-1]=temp;
        for(int i=0;i<n;i++){
            ans*=arr[i];
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
