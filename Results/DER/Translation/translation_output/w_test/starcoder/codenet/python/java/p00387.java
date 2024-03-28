<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
2


```
l=input().split()
A=int(l[0])
B=int(l[1])
kimawasi=B//A
if B%A>0:
    kimawasi=kimawasi+1
print(kimawasi)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int kimawasi=B/A;
        if(B%A>0)
            kimawasi=kimawasi+1;
        System.out.println(kimawasi);
    }
}
```
<|endoftext|>
