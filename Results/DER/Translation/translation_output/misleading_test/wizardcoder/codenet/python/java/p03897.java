Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1

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

### Response:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(i%2!=0){
                ans.add(new int[]{i,0});
            }
        }
        for(int i=0;i<n-1;i++){
            if(i%6==1){
                for(int j=2;j<n;j++){
                    if(j%2==0){
                        ans.add(new int[]{i,j});
                    }
                }
            }
            if(i%6==4){
                for(int j=0;j<n;j++){
                    if(j%2!=0){
                        ans.add(new int[]{i,j});
                    }
                }
            }
        }
        for(int j=0;j<n;j++){
            if((n-1+j)%2!=0){
                ans.add(new int[]{n-1,j});
            }
        }
        System.out.println(ans.size());
        for(int[] p:ans){
            System.out.println(p[0]+" "+p[1]);
        }
    }
}
```<|endoftext|>
