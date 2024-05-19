System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
84
3''1LZ'

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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int a = K / 50;
        int b = K % 50;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50 - b; i++) {
            sb.append(a + i).append(" ");
        }
        for (int i = 0; i < b; i++) {
            sb.append(a + 50 - b + i + 1).append(" ");
        }
        System.out.println(50);
        System.out.println(sb.toString().trim());
    }
}
```

Test input:
0

Expected output:
84
3''1LZ'<|endoftext|>
