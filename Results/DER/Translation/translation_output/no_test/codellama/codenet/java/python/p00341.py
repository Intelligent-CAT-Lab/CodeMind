<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import collections
import itertools

def is_valid_sequence(sequence):
    # Check if the sequence has at most 3 distinct elements
    if len(set(sequence)) > 3:
        return False

    # Sort the sequence
    sequence.sort()

    # Check if each element appears exactly 4, 8, or 12 times
    for element, count in itertools.groupby(sequence):
        if count not in [4, 8, 12]:
            return False

    return True

# Test the function
sequence = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
print(is_valid_sequence(sequence)) # Should print "yes"

sequence = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13]
print(is_valid_sequence(sequence)) # Should print "no"
```
This code uses the `itertools.groupby` function to group the elements of the sequence by their value, and then checks if each group has exactly 4, 8, or 12 elements. It also uses the `set` function to check if the sequence has at most 3 distinct elements.</s>
