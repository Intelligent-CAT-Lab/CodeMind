<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2 2 -72

```
import java.util.Scanner;

class p03583 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        // a
        for (int i = 1; i < 3510; i++) {
            // b
            for (int j = 1; j < 3510; j++) {
                long si = n * i * j;
                long bo = 4 * i * j - n * j - n * i;
                if (bo <= 0) {
                    continue;
                }
                if (si % bo == 0) {
                    System.out.println(i + " " + j + " " + (si / bo));
                    return;
                }
            }
        }
    }
}

```
[/INST]
```python
n = int(input())

for i in range(1, 3510):
    for j in range(1, 3510):
        si = n * i * j
        bo = 4 * i * j - n * j - n * i
        if bo <= 0:
            continue
        if si % bo == 0:
            print(i, j, (si / bo))
            break
```</s>
