<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
4
3 3 3 3


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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int a = K / 50, b = K % 50;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 50 - b; i++) {
            ans.add(String.valueOf(a + i));
        }
        for (int i = 0; i < b; i++) {
            ans.add(String.valueOf(a + 50 - b + i + 1));
        }
        System.out.println(ans.stream().mapToInt(Integer::parseInt).sum());
    }
}
```</s>
