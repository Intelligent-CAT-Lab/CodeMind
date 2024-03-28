<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AIZUNYANPEROPERO

Expected output:
AZ


```
s = input()
ans = ""
flag = False
for c in s:
  if c == "A" and not flag:flag = True
  if c == "Z" and flag:
    ans += "AZ"
    flag = False
if ans == "":
  print(-1)
else:
  print(ans)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' && !flag) {
                flag = true;
            } else if (c == 'Z' && flag) {
                ans += "AZ";
                flag = false;
            }
        }
        if (ans.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then iterates through each character in the input string using a `for` loop. It checks if the current character is 'A' and if the `flag` variable is false, if so it sets the `flag` variable to true. If the current character is 'Z' and the `flag` variable is true, it appends "AZ" to the `ans` string and sets the `flag` variable to false. If the `ans` string is empty at the end, it prints -1, otherwise it prints the `ans` string.</s>
