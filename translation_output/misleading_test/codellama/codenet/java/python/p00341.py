<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def is_valid_sequence(sequence):
    # Check if the sequence has at most 3 distinct elements
    if len(set(sequence)) > 3:
        return False

    # Sort the sequence
    sequence.sort()

    # Check if each element appears exactly 4, 8, or 12 times
    for element in set(sequence):
        count = sequence.count(element)
        if count not in [4, 8, 12]:
            return False

    return True

# Test the function with the provided input
sequence = [1, 1, 3, 4, 8, 9, 7, 3, 4, 5, 5, 5]
print(is_valid_sequence(sequence))
```
This code defines a function `is_valid_sequence` that takes a list of integers as input and returns `True` if the sequence is valid, and `False` otherwise. The function first checks if the sequence has at most 3 distinct elements, and then sorts the sequence. It then checks if each element appears exactly 4, 8, or 12 times in the sequence. If any element does not appear with the expected frequency, the function returns `False`. If all elements appear with the expected frequency, the function returns `True`.

The code also includes a test case that demonstrates how to use the `is_valid_sequence` function. The test case creates a list of integers and passes it to the `is_valid_sequence` function. The function returns `True` if the sequence is valid, and `False` otherwise. The test case then prints the result to the console.</s>
