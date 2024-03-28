<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 3 4 8 9 7 3 4 5 5 5

Expected output:
no


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
    count_elements = Counter(seq)
    if len(count_elements) > 3:
        return "no"
    counts = list(count_elements.values())
    if all(count % 3 == 0 for count in counts):
        return "yes"
    else:
        return "no"

test_input = list(map(int, input().split()))
print(check_sequence(test_input))
```

This Python code reads a sequence of integers from the standard input, counts the occurrences of each distinct element, and checks if all counts are multiples of 3. If so, it prints "yes", otherwise it prints "no".
<|EOT|>
