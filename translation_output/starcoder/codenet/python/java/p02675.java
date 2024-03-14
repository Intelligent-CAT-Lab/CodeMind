<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=n%10;
        if(n==3)
            System.out.println("bon");
        else if(n==2 || n==4 || n==5 || n==7 || n==9)
            System.out.println("hon");
        else
            System.out.println("pon");
    }
}
```
<|endoftext|>
