<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    e = [int(input()) for _ in range(12)]
    if len(set(e)) > 3:
        print("no")
        return
    counter = Counter(e)
    for count in counter.values():
        if count != 4 and count != 8 and count != 12:
            print("no")
            return
    print("yes")

if __name__ == "__main__":
    main()
```
This Python code does the same thing as the Java code. It reads 12 integers from the standard input, checks if there are more than 3 distinct numbers, and if the count of each number is either 4, 8, or 12. If all these conditions are met, it prints "yes", otherwise it prints "no".
<|EOT|>
