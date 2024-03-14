Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 50 - b; i++) {
            ans.add(Integer.toString(a + i));
        }
        for (int i = 0; i < b; i++) {
            ans.add(Integer.toString(a + 50 - b + i + 1));
        }
        System.out.println(String.join(" ", ans));
    }
}
```<|endoftext|>
