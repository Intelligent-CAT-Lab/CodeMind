<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
X,Y,Z=map(int,input().split())

answer=0
width=Y+2*Z
while(width<=X):
  answer+=1
  width+=Y+Z
  
print(answer)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, Y, Z;
        X = scanner.nextInt();
        Y = scanner.nextInt();
        Z = scanner.nextInt();
        int answer = 0;
        int width = Y + 2 * Z;
        while (width <= X) {
            answer++;
            width += Y + Z;
        }
        System.out.println(answer);
    }
}
```</s>
