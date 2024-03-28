<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
pdbq

Expected output:
Yes


```
s = list(input())
t = s[::-1]
for i in range(len(t)):
  if t[i] == "p":
    t[i] = "q"
  elif t[i] == "q":
    t[i] = "p"
  if t[i] == "b":
    t[i] = "d"
  elif t[i] == "d":
    t[i] = "b" 
if s == t:
  ans = "Yes"
else:
  ans = "No"
print(ans)
    
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == 'p') {
                t = t.substring(0, i) + 'q' + t.substring(i + 1);
            } else if (t.charAt(i) == 'q') {
                t = t.substring(0, i) + 'p' + t.substring(i + 1);
            } else if (t.charAt(i) == 'b') {
                t = t.substring(0, i) + 'd' + t.substring(i + 1);
            } else if (t.charAt(i) == 'd') {
                t = t.substring(0, i) + 'b' + t.substring(i + 1);
            }
        }
        if (s.equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note: The above code uses the `StringBuilder` class to reverse the string, and the `substring` method to replace the characters in the string. The `charAt` method is used to access the characters in the string.</s>
