<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
from collections import Counter

def main():
    e = list(map(int, input().split()))

    if len(set(e)) > 3:
        print("no")
        return

    e.sort()
    count = Counter(e)

    for k, v in count.items():
        if v != 4 and v != 8 and v != 12:
            print("no")
            return

    print("yes")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a list of integers from the input, checks if there are more than 3 distinct numbers, sorts the list, counts the occurrences of each number, and checks if each count is either 4, 8, or 12. If any of these conditions are not met, it prints "no" and returns. Otherwise, it prints "yes".<｜end▁of▁sentence｜>
