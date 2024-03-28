<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
pdbq

Expected output:
cU~

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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == 'p') {
                t.charAt(i) = 'q';
            } else if (t.charAt(i) == 'q') {
                t.charAt(i) = 'p';
            } else if (t.charAt(i) == 'b') {
                t.charAt(i) = 'd';
            } else if (t.charAt(i) == 'd') {
                t.charAt(i) = 'b';
            }
        }
        if (s.equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
