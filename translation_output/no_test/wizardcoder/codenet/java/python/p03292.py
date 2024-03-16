Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class p03292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R = sc.nextInt();
        int Y = sc.nextInt();

        int A = Math.max(Math.max(T,R),Y);
        int B = Math.min(Math.min(T,R),Y);

        System.out.println(A-B);
    }
}

```

### Response:
```python
import java.util.ArrayList
import java.util.List
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    T = sc.nextInt()
    R = sc.nextInt()
    Y = sc.nextInt()

    A = max(max(T,R),Y)
    B = min(min(T,R),Y)

    print(A-B)

if __name__ == '__main__':
    main()
```

Note: The `java` code uses `Scanner` class to read input from the user. In Python, we use the `input()` function instead. Also, the `java` code uses `Math.max()` and `Math.min()` functions to find the maximum and minimum values of `T`, `R`, and `Y`. In Python, we can use the built-in `max()` and `min()` functions to achieve the same result.<|endoftext|>
