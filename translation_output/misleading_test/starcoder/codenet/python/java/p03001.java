<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1 2

Expected output:
6.8558008881848735 82

```
w,h,x,y = map(float,input().split())
mx,my = w/2,h/2
res= []
res.append(w*h/2)
if x==mx and y==my:
    res.append(1)
else:
    res.append(0)
print(res[0],res[1])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double mx = w/2;
        double my = h/2;
        double res = w*h/2;
        if(x==mx && y==my)
            System.out.println(res+" "+1);
        else
            System.out.println(res+" "+0);
    }
}
```
'''
<|endoftext|>
