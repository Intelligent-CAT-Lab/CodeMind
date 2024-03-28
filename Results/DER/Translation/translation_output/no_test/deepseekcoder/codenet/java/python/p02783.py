<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    line = sys.stdin.readline().split()

    h = int(line[0])
    a = int(line[1])

    n = h//a
    if h%a > 0:
        n += 1

    print(n)

if __name__ == "__main__":
    main()
```
<|EOT|>
