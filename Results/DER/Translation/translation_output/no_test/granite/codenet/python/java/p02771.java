System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a,b,c = map(int,input().split())
if a == b and b!= c:
  print("Yes")
elif b == c and a!= b:
  print("Yes")
elif a == c and a!= b:
  print("Yes")
else:
  print("No")
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b!= c) {
            System.out.println("Yes");
        } else if (b == c && a!= b) {
            System.out.println("Yes");
        } else if (a == c && a!= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```<|endoftext|>
