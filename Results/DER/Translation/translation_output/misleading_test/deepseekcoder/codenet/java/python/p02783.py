<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 4

Expected output:
78

```
import java.util.Scanner;
public class p02783 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");

            int h = Integer.valueOf(line[0]);
            int a = Integer.valueOf(line[1]);

            int n = h/a;
            if (h%a > 0) {
                n += 1;
            }

            // åºå
            System.out.println(n);
        }
    }
}
```

### Response:
```python
h, a = map(int, input().split())

n = h//a
if h%a > 0:
    n += 1

print(n)
```
<|EOT|>
