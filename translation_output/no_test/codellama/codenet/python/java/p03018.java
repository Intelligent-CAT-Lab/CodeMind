<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

#https://atcoder.jp/contests/agc034/submissions/5781329
S = input()
ans = 0
a = 0
i = 0
while (i < len(S)):
  if S[i] == 'A':
    a += 1
    i += 1
  elif S[i:i+2] == 'BC':
    ans += a
    i += 2
  else:
    a = 0
    i += 1
print(ans)


Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int ans = 0;
        int a = 0;
        int i = 0;
        while (i < S.length()) {
            if (S.charAt(i) == 'A') {
                a++;
                i++;
            } else if (S.substring(i, i+2).equals("BC")) {
                ans += a;
                i += 2;
            } else {
                a = 0;
                i++;
            }
        }
        System.out.println(ans);
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The logic is similar to the Python code, with a few minor differences in syntax.

Note that the `substring` method is used to extract a substring of length 2 from the input string, which is then compared to the string "BC" using the `equals` method. This is necessary because the `substring` method returns a `String` object, which cannot be compared directly to a string literal using the `==` operator.</s>
