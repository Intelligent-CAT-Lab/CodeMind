<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
Yes


```
n = input()
tmp = 0
for i in range(len(n)):
  tmp = (tmp + int(n[i])) % 9

print("Yes") if tmp == 0 else print("No")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int tmp = 0;
        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Integer.parseInt(n.charAt(i))) % 9;
        }
        System.out.println(tmp == 0? "Yes" : "No");
    }
}
```
'''
<|endoftext|>
