<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class atcoder_ABC164_A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        scList.add(scan.nextLine());

        String[] numlist = scList.get(0).split(" ");
        int Sheep = Integer.parseInt(numlist[0]);
        int Wolve = Integer.parseInt(numlist[1]);

        if (Wolve >= Sheep) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

scList = []

for line in sys.stdin:
    scList.append(line.strip())

numlist = scList[0].split(" ")
Sheep = int(numlist[0])
Wolve = int(numlist[1])

if Wolve >= Sheep:
    print("unsafe")
else:
    print("safe")
```
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing whitespace from the input lines. The `split()` method is used to split the input line into a list of strings, and the `int()` function is used to convert the strings to integers. The rest of the code is similar to the Java code, with the exception of the `print()` function, which is used to print the output to the standard output stream.</s>
