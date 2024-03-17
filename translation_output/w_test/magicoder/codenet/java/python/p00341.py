<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
from collections import Counter

def check_list(lst):
    count = Counter(lst)
    if len(count) > 3:
        return "no"
    for v in count.values():
        if v != 4 and v != 8 and v != 12:
            return "no"
    return "yes"

# Test input
lst = [1, 1, 3, 4, 8, 9, 7, 3, 4, 5, 5, 5]
print(check_list(lst))  # Expected output: no
```

This Python code uses the `Counter` class from the `collections` module to count the occurrences of each number in the list. If there are more than 3 distinct numbers, it returns "no". Then it checks if each number's count is 4, 8, or 12. If not, it returns "no". If all checks pass, it returns "yes".<｜end▁of▁sentence｜>
