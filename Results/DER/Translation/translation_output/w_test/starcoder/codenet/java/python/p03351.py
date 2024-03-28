<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 7 9 3

Expected output:
Yes


```
import java.util.Scanner;
public class p03351{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int ab = Math.abs(a-b);
        int ac = Math.abs(a-c);
        int bc = Math.abs(b-c);
        if(ac <= d || (ab <= d && bc <= d)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

a, b, c, d = map(int, sys.stdin.readline().split())

if abs(a-b) <= d or (abs(a-c) <= d and abs(b-c) <= d):
    print("Yes")
else:
    print("No")
```
<|endoftext|>
