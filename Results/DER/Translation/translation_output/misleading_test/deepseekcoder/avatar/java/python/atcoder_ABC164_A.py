<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 100

Expected output:
unRsafe

```
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
```

### Response:
```python
import sys

def main():
    Sheep, Wolve = map(int, sys.stdin.readline().split())

    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. If the number of wolves is greater than or equal to the number of sheep, the program prints "unsafe". Otherwise, it prints "safe".
<|EOT|>
