<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YES


```
import re
pattern = r"^A?KIHA?BA?RA?$"
S = input()
if re.match(pattern,S):
    print("YES")
else:
    print("NO")
```

java code:<fim_suffix><fim_middle>
```
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if(S.matches("^A?KIHA?BA?RA?$"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
```
'''
<|endoftext|>
