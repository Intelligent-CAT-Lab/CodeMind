<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 3 4 8 9 7 3 4 5 5 5

Expected output:
no


```
a=[0]*100
b=list(map(int,input().split()))
for i in range(12):
    a[b[i]-1]+=1
c=0
for i in range(100):
    if a[i] and a[i]%4==0: c+=a[i]//4
print('yes' if c==3 else 'no')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[100];
        int[] b=new int[12];
        for(int i=0;i<12;i++) b[i]=sc.nextInt();
        for(int i=0;i<12;i++) a[b[i]-1]++;
        int c=0;
        for(int i=0;i<100;i++) if(a[i]!=0 && a[i]%4==0) c+=a[i]/4;
        System.out.println(c==3?"yes":"no");
    }
}
```
'''
<|endoftext|>
