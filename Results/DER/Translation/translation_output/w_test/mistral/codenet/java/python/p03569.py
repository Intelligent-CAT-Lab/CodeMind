<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
xabxa

Expected output:
2


```
import java.util.*;

public class p03569 {
    public void main(Scanner sc) {
        String s = sc.next();
        int length = s.length();

        int cnt = 0;
        int l = 0;
        int r = length - 1;
        while (l <= r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);

            if (cl == cr) {
                l++;
                r--;
            } else {
                if (cl == 'x') {
                    cnt++;
                    l++;
                } else if (cr == 'x') {
                    cnt++;
                    r--;
                } else {
                    cnt = -1;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03569().main(sc);
        sc.close();
    }
}

```
[/INST]
```python
s = input()
length = len(s)

cnt = 0
l = 0
r = length - 1
while l <= r:
    cl = s[l]
    cr = s[r]

    if cl == cr:
        l += 1
        r -= 1
    elif cl == 'x':
        cnt += 1
        l += 1
    else:
        cnt = -1
        break

print(cnt)
```</s>
