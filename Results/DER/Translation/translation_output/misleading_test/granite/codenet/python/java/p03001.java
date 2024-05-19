System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double mx = w / 2;
        double my = h / 2;
        double area = w * h / 2;
        int inside = 0;
        if (x == mx && y == my) {
            inside = 1;
        }
        System.out.println(area + " " + inside);
    }
}
```

Test input:
```
2 3 1 2
```

Expected output:
```
6.8558008881848735 82
```<|endoftext|>
