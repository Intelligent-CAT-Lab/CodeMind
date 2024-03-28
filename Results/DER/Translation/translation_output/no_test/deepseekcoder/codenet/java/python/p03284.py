<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03284{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        if(n%k == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
```

### Response:
```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    if n % k == 0:
        print(0)
    else:
        print(1)

if __name__ == "__main__":
    main()
```
<|EOT|>
