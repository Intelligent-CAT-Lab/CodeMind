<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] t = s.toCharArray();
        for (int i = 0; i < t.length; i++) {
            if (t[i] == 'p') {
                t[i] = 'q';
            } else if (t[i] == 'q') {
                t[i] = 'p';
            }
            if (t[i] == 'b') {
                t[i] = 'd';
            } else if (t[i] == 'd') {
                t[i] = 'b';
            }
        }
        if (s.equals(new String(t))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

'''
<|endoftext|>
