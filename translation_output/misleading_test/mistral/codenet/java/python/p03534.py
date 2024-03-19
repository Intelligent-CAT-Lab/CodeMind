<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abac

Expected output:
Y@ES

```
import java.util.*;

public class p03534 {
    public void main(Scanner sc) {
        String str = sc.next();
        int abc[] = new int[3];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                if (str.charAt(i) == "abc".charAt(j)) {
                    abc[j]++;
                }
            }
        }

        Arrays.sort(abc);

        System.out.println(((abc[1] - abc[0] < 2) && (abc[2] - abc[0] < 2)) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03534().main(sc);
        sc.close();
    }
}

```
[/INST]
```python
str = input()
abc = [0, 0, 0]
for i in range(len(str)):
    for j in range(3):
        if str[i] == "abc"[j]:
            abc[j] += 1

abc.sort()

if (abs(abc[1] - abc[0]) < 2 and abs(abc[2] - abc[0]) < 2):
    print("YES")
else:
    print("NO")
```</s>
