<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
K=int(input())
print(50)
a,b=K//50,K%50
ans=[]
for i in range(50-b):
  ans.append(str(a+i))
  
for i in range(b):
  ans.append(str(a+50-b+i+1))
  
print(" ".join(ans))
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        String[] ans = new String[50];
        for (int i = 0; i < 50 - b; i++) {
            ans[i] = String.valueOf(a + i);
        }
        for (int i = 0; i < b; i++) {
            ans[50 - b + i] = String.valueOf(a + 50 - b + i + 1);
        }
        System.out.println(String.join(" ", ans));
    }
}
```<｜end▁of▁sentence｜>
