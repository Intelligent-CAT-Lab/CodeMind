<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02924 {

    public static void main(String args[]) {

        // å¥å
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // ä¸»å¦ç
        long result = 0;
        for (int i = n - 1; 0 < i; i--) {
            result += i;
        }

        // åºå
        System.out.println(result);
        sc.close();
    }

}
```

@@ Response
```python
# å¥å
n = int(input())

# ä¸»å¦ç
result = 0
for i in range(n - 1, 0, -1):
    result += i

# åºå
print(result)
```<｜end▁of▁sentence｜>
