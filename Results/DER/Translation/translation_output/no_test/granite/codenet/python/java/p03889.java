System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = new StringBuilder(s).reverse().toString();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for (int i = 0; i < tArray.length; i++) {
            if (tArray[i] == 'p') {
                tArray[i] = 'q';
            } else if (tArray[i] == 'q') {
                tArray[i] = 'p';
            }
            if (tArray[i] == 'b') {
                tArray[i] = 'd';
            } else if (tArray[i] == 'd') {
                tArray[i] = 'b';
            }
        }
        String ans = "No";
        if (Arrays.equals(sArray, tArray)) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
