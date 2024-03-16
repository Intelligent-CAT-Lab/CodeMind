Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```

s = input()

ans = 0
for i in range(2 ** (len(s) - 1)):
    pat = s[0]
    index = 1
    for j in range(len(s) - 1):
        if i >> j & 1:
            pat += "+"
        pat += s[index]
        index += 1
    #print(pat)
    ans += eval(pat)

print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            String pat = s.charAt(0) + "";
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i & (1 << j))!= 0) {
                    pat += "+";
                }
                pat += s.charAt(index);
                index++;
            }
            //System.out.println(pat);
            ans += eval(pat);
        }

        System.out.println(ans);
    }

    public static int eval(String s) {
        int res = 0;
        int sign = 1;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-') {
                res += sign * num;
                sign = (c == '+')? 1 : -1;
                num = 0;
            } else if (c == '(') {
                int sub = eval(s.substring(i + 1));
                i += s.substring(i + 1).lastIndexOf(')') + 1;
                num += sub;
            } else {
                num = num * 10 + (c - '0');
            }
        }
        res += sign * num;
        return res;
    }
}
```<|endoftext|>
