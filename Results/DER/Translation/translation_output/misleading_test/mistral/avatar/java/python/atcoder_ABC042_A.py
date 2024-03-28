<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
NO

```
import java.util.*;

class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int num_1 = Integer.parseInt(str);

        str = scan.next();
        int num_2 = Integer.parseInt(str);

        str = scan.next();
        int num_3 = Integer.parseInt(str);

        if (num_1 == 7) {
            if (num_2 == 5 && num_3 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (num_2 == 7) {
            if (num_1 == 5 && num_3 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (num_3 == 7) {
            if (num_2 == 5 && num_1 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```
[/INST]
```python
# Sample test case
num1, num2, num3 = map(int, input().split())

if num1 == 7:
    if num2 == 5 and num3 == 5:
        print("YES")
    else:
        print("NO")
elif num2 == 7:
    if num1 == 5 and num3 == 5:
        print("YES")
    else:
        print("NO")
else:
    if num2 == 5 and num3 == 5:
        print("YES")
    else:
        print("NO")
```</s>
