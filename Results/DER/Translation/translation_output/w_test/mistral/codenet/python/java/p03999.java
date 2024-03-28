<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
125

Expected output:
176


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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int ans = 0;
        for (int i = 1; i < Math.pow(2, s - 1); i++) {
            String pat = "";
            int index = 1;
            for (int j = 0; j < s - 1; j++) {
                if ((i >> j) & 1 == 1) {
                    pat += "+";
                }
                pat += s.toString().charAt(index);
                index++;
            }
            //System.out.println(pat);
            ans += eval(pat);
        }
        System.out.println(ans);
    }

    public static int eval(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                ans++;
            } else {
                ans--;
            }
        }
        return ans;
    }
}
```</s>
