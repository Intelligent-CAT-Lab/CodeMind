<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 3 4 8 9 7 3 4 5 5 5

Expected output:
Ys

```
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class p00341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> e = new LinkedList<>();
        long each;
        Object[] disinct;

        for(int i = 0; i < 12; i++) {
            e.add(sc.nextInt());
        }

        if(e.stream().distinct().count() > 3) {
            System.out.println("no");
            return;
        }
        Collections.sort(e);
        disinct = e.stream().distinct().toArray();
        for(Object a : disinct) {
            each = e.stream().filter(i -> i == a).count();
            if(each != 4 && each != 8 && each != 12) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
```

### Response:
```python
from collections import Counter

def check_sequence(seq):
    counter = Counter(seq)
    if len(counter) > 3:
        return "no"
    counts = list(counter.values())
    if 4 not in counts and 8 not in counts and 12 not in counts:
        return "no"
    return "yes"

def main():
    sequence = list(map(int, input().split()))
    if len(sequence) != 12:
        return "Invalid input"
    print(check_sequence(sequence))

if __name__ == "__main__":
    main()
```

This Python code reads a sequence of 12 integers from the standard input, checks if the sequence has at most 3 distinct elements, and checks if each distinct element appears either 4, 8, or 12 times. If all conditions are met, it prints "yes", otherwise it prints "no".
<|EOT|>
