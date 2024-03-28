<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
117

Expected output:
Ys

```
import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7") ? "Yes" : "No");
    }
}
```
[/INST]
```python
n = int(input())
string = str(n)
print("Yes" if "7" in string else "No")
```</s>
