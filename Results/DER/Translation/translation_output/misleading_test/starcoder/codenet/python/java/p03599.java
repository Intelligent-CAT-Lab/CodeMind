<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 10 20 15 200

Expected output:
188 -48

```
a,b,c,d,e,f=map(int,input().split())
maxsugar=0
maxwater=100*a
for i in range(31):
    for j in range(31):
        for k in range(3001):
            water=100*a*i+100*b*j
            sugar=c*k
            if water+sugar>f:
                continue
            if sugar>(a*i+b*j)*e:
                continue
            sugar+=min((f-(water+sugar))//d*d,((a*i+b*j)*e-c*k)//d*d)
            if 100*maxsugar*(water+sugar)<100*sugar*(maxsugar+maxwater):
                maxsugar=sugar
                maxwater=water
print(maxsugar+maxwater,maxsugar)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        int maxsugar=0;
        int maxwater=100*a;
        for(int i=0;i<31;i++){
            for(int j=0;j<31;j++){
                for(int k=0;k<3001;k++){
                    int water=100*a*i+100*b*j;
                    int sugar=c*k;
                    if(water+sugar>f)
                        continue;
                    if(sugar>(a*i+b*j)*e)
                        continue;
                    sugar+=Math.min((f-(water+sugar))//d*d,((a*i+b*j)*e-c*k)//d*d);
                    if(100*maxsugar*(water+sugar)<100*sugar*(maxsugar+maxwater)){
                        maxsugar=sugar;
                        maxwater=water;
                    }
                }
            }
        }
        System.out.println(maxsugar+maxwater+" "+maxsugar);
    }
}
```
<|endoftext|>
