<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
4
3 3 3 3


```
K=int(input())
print(50)
a,b=K//50,K%50
ans=[]
for i in range(50-b):
  ans.append(str(a+i))
  
for i in range(b):
  ans.append(str(a+50-b+i+1))
  
print(" ".join(ans))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        System.out.println(50);
        int a=K/50;
        int b=K%50;
        String[] ans=new String[50];
        for(int i=0;i<50-b;i++)
            ans[i]=String.valueOf(a+i+1);
        for(int i=0;i<b;i++)
            ans[50-b+i]=String.valueOf(a+50-b+i+1);
        for(int i=0;i<50;i++)
            System.out.print(ans[i]+" ");
    }
}
```
<|endoftext|>
