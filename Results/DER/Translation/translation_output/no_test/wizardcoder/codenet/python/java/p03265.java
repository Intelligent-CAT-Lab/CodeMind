Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,s,d,f=map(int,input().split())
x3=d-f+s
y3=f+d-a
x4=a-f+s
y4=s+d-a
print(x3,y3,x4,y4)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();
        int x3 = d - f + s;
        int y3 = f + d - a;
        int x4 = a - f + s;
        int y4 = s + d - a;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```<|endoftext|>
