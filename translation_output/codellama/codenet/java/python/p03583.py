<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import math

n = int(input("Enter a number: "))

for i in range(1, 3510):
    for j in range(1, 3510):
        si = n * i * j
        bo = 4 * i * j - n * j - n * i
        if bo <= 0:
            continue
        if si % bo == 0:
            print(i, j, si // bo)
            break
    else:
        continue
    break
```
This is the Python code that translates the Java code you provided. The main difference is that Python uses `//` for integer division, while Java uses `/`. Additionally, Python uses `range` to iterate over a sequence of numbers, while Java uses a `for` loop with a `Scanner` object.</s>
