<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
ans=[]
for i in range(n-1):
  if i%2:
    ans+=[(i,0)]
for i in range(n-1):
  if i%6==1:
    for j in range(2,n):
      if j%2==0:
        ans+=[(i,j)]
  if i%6==4:
    for j in range(n):
      if j%2:
        ans+=[(i,j)]
for j in range(n):
  if(n-1+j)%2:
    ans+=[(n-1,j)]
print(len(ans))
for x,y in ans:
  print(x,y)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] ans=new int[n-1][2];
        for(int i=0;i<n-1;i++){
            if(i%2==1){
                ans[i][0]=i;
                ans[i][1]=0;
            }
        }
        for(int i=0;i<n-1;i++){
            if(i%6==1){
                for(int j=2;j<n;j++){
                    if(j%2==0){
                        ans[i][0]=i;
                        ans[i][1]=j;
                    }
                }
            }
            if(i%6==4){
                for(int j=0;j<n;j++){
                    if(j%2==1){
                        ans[i][0]=i;
                        ans[i][1]=j;
                    }
                }
            }
        }
        for(int j=0;j<n;j++){
            if((n-1+j)%2==1){
                ans[n-1][0]=n-1;
                ans[n-1][1]=j;
            }
        }
        System.out.println(ans.length);
        for(int[] a:ans){
            System.out.println(a[0]+" "+a[1]);
        }
    }
}
```
<|endoftext|>
