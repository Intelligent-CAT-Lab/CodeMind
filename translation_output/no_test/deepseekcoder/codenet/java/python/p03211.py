<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int min = 1000;
        for (int i = 0; i < S.length() - 2; i++) {
            int X = Integer.parseInt(S.substring(i, i + 3));
            min = Math.min(min, Math.abs(X - 753));
        }
        System.out.println(min);
        sc.close();
    }
}
```

### Response:
```python
import sys

def main():
    S = input()
    min_diff = sys.maxsize
    for i in range(len(S) - 2):
        X = int(S[i:i + 3])
        min_diff = min(min_diff, abs(X - 753))
    print(min_diff)

if __name__ == "__main__":
    main()
```
<|EOT|>
