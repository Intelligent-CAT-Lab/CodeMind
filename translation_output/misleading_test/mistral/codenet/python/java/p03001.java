<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h, x, y;
        w = sc.nextInt();
        h = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int mx = w / 2;
        int my = h / 2;
        List<Integer> res = new ArrayList<>();
        res.add(w * h / 2);
        if (x == mx && y == my) {
            res.add(1);
        } else {
            res.add(0);
        }
        System.out.println(res.get(0) + " " + res.get(1));
    }
}
```</s>
