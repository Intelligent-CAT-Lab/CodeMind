<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 16

Expected output:
9


```
A,B=map(int,input().split())
x=(A**2-B**2)/(2*(A-B))
if x%1==0:
    print(int(x))
else:
    print('IMPOSSIBLE')
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = (A*A-B*B)/(2*(A-B));
        if(x%1==0)
            System.out.println(x);
        else
            System.out.println("IMPOSSIBLE");
    }
}
```
<|endoftext|>
