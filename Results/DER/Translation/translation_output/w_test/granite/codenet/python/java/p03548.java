System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
13 3 1

Expected output:
3


```
X,Y,Z=map(int,input().split())

answer=0
width=Y+2*Z
while(width<=X):
  answer+=1
  width+=Y+Z
  
print(answer)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int answer = 0;
        int width = Y + 2 * Z;
        while (width <= X) {
            answer += 1;
            width += Y + Z;
        }
        System.out.println(answer);
    }
}
```

Test input:
```
13 3 1
```

Expected output:
```
3
```<|endoftext|>
