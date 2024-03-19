<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2 2 -7

```
import sys
N=int(input())
for h in range(1,3501):
    for n in range(h,3501):
        if 4*n*h-N*h-N*n >0:
            if (N*h*n)%(4*n*h-N*h-N*n)==0:
                w=int((N*h*n)/(4*n*h-N*h-N*n))
                print(h,n,w)
                sys.exit()
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int h=1;h<3501;h++){
            for(int n=h;n<3501;n++){
                if(4*n*h-N*h-N*n>0){
                    if((N*h*n)%(4*n*h-N*h-N*n)==0){
                        int w=(N*h*n)/(4*n*h-N*h-N*n);
                        System.out.println(h+" "+n+" "+w);
                        return;
                    }
                }
            }
        }
    }
}
```
'''
<|endoftext|>
