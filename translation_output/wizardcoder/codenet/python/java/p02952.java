Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
ans=0
for i in range(n):
  hoge=str(i+1)
  if(len(hoge)%2==1):
    ans+=1
print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      String hoge = String.valueOf(i + 1);
      if (hoge.length() % 2 == 1) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}
```<|endoftext|>
