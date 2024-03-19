<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud,

Expected output:
@nxzq asadas asdasf

```
import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        System.out.println(a + " " + b + " " + c);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

a, b, c = sys.stdin.readline().split(",")
print(a, b, c)
```

"""
<|endoftext|>
