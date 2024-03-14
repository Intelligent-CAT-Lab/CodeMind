Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
moji = str(input())
ans = ""
for i in range(len(moji)):
    ans += ("1","9")[moji[i]=="1"]
print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moji = sc.nextLine();
        String ans = "";
        for (int i = 0; i < moji.length(); i++) {
            ans += (moji.charAt(i) == '1')? "1" : "9";
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
