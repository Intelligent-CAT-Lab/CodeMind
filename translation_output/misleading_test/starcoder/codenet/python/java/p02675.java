<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
16

Expected output:
poA

```
n=int(input())%10
if n==3:
    print("bon")
elif n in [2,4,5,7,9]:
    print("hon")
else:
    print("pon")

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%10==3)
            System.out.println("bon");
        else if(n%10==2 || n%10==4 || n%10==5 || n%10==7 || n%10==9)
            System.out.println("hon");
        else
            System.out.println("pon");
    }
}
```
'''
<|endoftext|>
