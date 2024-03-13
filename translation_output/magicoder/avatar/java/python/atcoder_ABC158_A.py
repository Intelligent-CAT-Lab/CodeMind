<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str.equals("AAA") || str.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

@@ Response
```python
str = input()

if str == "AAA" or str == "BBB":
    print("No")
else:
    print("Yes")
```<｜end▁of▁sentence｜>
