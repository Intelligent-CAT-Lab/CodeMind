Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] sArr = s.toCharArray();
        char[] tArr = new char[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] == 'p') {
                tArr[i] = 'q';
            } else if (sArr[i] == 'q') {
                tArr[i] = 'p';
            } else if (sArr[i] == 'b') {
                tArr[i] = 'd';
            } else if (sArr[i] == 'd') {
                tArr[i] = 'b';
            }
        }
        String t = new String(tArr);
        if (s.equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```<|endoftext|>
