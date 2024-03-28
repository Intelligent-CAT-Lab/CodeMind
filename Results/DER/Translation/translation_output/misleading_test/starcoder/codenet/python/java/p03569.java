<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
xabxa

Expected output:
-65

```
import sys
S = str(input())
i = 0
j = len(S) - 1
c = 0
while(True):
    if i >= j:
        break
    if (S[i] == S[j]):
        i += 1
        j -= 1
    else:
        if (S[i] == 'x'):
            i += 1
            c += 1
        elif (S[j] == 'x'):
            j -= 1
            c += 1
        else:
            print('-1')
            sys.exit()
print(c)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0, j = s.length() - 1, c = 0;
        while(true) {
            if (i >= j) break;
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                if (s.charAt(i) == 'x') {
                    i++;
                    c++;
                } else if (s.charAt(j) == 'x') {
                    j--;
                    c++;
                } else {
                    System.out.println("-1");
                    return;
                }
            }
        }
        System.out.println(c);
    }
}
```
'''
<|endoftext|>
