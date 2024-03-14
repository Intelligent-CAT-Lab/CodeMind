<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        char upper = lines[1].charAt(0);
        System.out.println("A" + upper +"C");
    }
}
```

### Response:
```python
import sys

def main():
    lines = sys.stdin.readline().split()
    upper = lines[1][0]
    print("A" + upper + "C")

if __name__ == "__main__":
    main()
```
<|EOT|>
