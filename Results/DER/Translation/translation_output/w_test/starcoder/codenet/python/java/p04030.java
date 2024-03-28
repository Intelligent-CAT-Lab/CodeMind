<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
01B0

Expected output:
00


```
s = input()
a = ""
for i in s:
  if i == "B":
    if not(a == ""):
      a = a[:-1]
  else:
    a += i
print(a)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'B') {
                if(!a.equals("")) {
                    a = a.substring(0, a.length() - 1);
                }
            } else {
                a += s.charAt(i);
            }
        }
        System.out.println(a);
    }
}
```
<|endoftext|>
