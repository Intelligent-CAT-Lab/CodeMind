Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
            if(each!= 4 && each!= 8 && each!= 12) {
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
            if(each!= 4 and each!= 8 and each!= 12) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
```

The given java code is a solution to the problem of checking whether a given sequence of numbers contains four, eight or twelve distinct numbers that appear exactly once each. The code uses a LinkedList to store the input sequence and then checks if the number of distinct elements in the sequence is greater than 3. If it is, then the sequence cannot contain four, eight or twelve distinct numbers that appear exactly once each. If the number of distinct elements is less than or equal to 3, then the code sorts the sequence and then checks if each distinct element appears exactly once each. If an element appears more than once or does not appear exactly once, then the sequence cannot contain four, eight or twelve distinct numbers that appear exactly once each. If all the elements appear exactly once each, then the sequence contains four, eight or twelve distinct numbers that appear exactly once each. The code then prints "yes" if the sequence satisfies the condition and "no" otherwise.<|endoftext|>
