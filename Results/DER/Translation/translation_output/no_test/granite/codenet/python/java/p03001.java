System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        String[] input = sc.nextLine().split(" ");
        float w = Float.parseFloat(input[0]);
        float h = Float.parseFloat(input[1]);
        float x = Float.parseFloat(input[2]);
        float y = Float.parseFloat(input[3]);
        float mx = w / 2;
        float my = h / 2;
        float area = w * h / 2;
        int isCenter = (x == mx && y == my)? 1 : 0;
        System.out.println(area + " " + isCenter);
    }
}
```<|endoftext|>
