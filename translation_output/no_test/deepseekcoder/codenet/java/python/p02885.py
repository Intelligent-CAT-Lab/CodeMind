<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02885 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        if(a > 2 * b)   System.out.println(a - 2 * b);
        else System.out.println(0);
    }
}
```

### Response:
```python
import sys

def main():
    line = sys.stdin.readline().strip()
    line1 = line.split(" ")
    a = int(line1[0])
    b = int(line1[1])
    if a > 2 * b:
        print(a - 2 * b)
    else:
        print(0)

if __name__ == "__main__":
    main()
```
<|EOT|>
