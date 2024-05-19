System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
..

Expected output:
54

```
import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                str += 0;
            } else {
                if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                    str += 1;
                } else {
                    str += 2;
                    i++;
                }
            }
        }

        System.out.println(str);
    }
}
```


Answer:
```python
s = input()
str = ""

for i in range(len(s)):
    if s[i] == '.':
        str += "0"
    else:
        if s[i] == '-' and s[i + 1] == '.':
            str += "1"
        else:
            str += "2"
            i += 1

print(str)
```

Test input:
```
..--.-.
```

Expected output:
```
02102
```<|endoftext|>
