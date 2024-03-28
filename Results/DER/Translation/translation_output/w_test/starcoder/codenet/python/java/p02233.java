<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
3


```
n=int(input())
a=1
b=1
i=0
while i<n:
    a,b=b,a+b
    i+=1
print(a)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        int i=0;
        while(i<n){
            a=b;
            b=a+b;
            i++;
        }
        System.out.println(a);
    }
}
```
<|endoftext|>
