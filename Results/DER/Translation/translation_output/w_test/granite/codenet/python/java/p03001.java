System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1 2

Expected output:
3.000000 0


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
        int isCenter = (x == mx && y == my)? 1 : 0;
        System.out.println(area + " " + isCenter);
    }
}
```

Test input:
```
2 3 1 2
```

Expected output:
```
3.000000 0
```<|endoftext|>
