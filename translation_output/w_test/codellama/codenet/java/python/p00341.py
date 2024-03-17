<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

def main():
    input_list = [int(x) for x in sys.stdin.read().split()]
    if len(set(input_list)) > 3:
        print("no")
        return
    input_list.sort()
    distinct_elements = set(input_list)
    for element in distinct_elements:
        count = input_list.count(element)
        if count not in [4, 8, 12]:
            print("no")
            return
    print("yes")

if __name__ == "__main__":
    main()
```
This code uses the `set` data structure to keep track of the distinct elements in the input list, and the `count` method to count the number of occurrences of each element. It then checks if the number of occurrences of each element is either 4, 8, or 12, and if not, it prints "no" and returns. If all elements have the correct number of occurrences, it prints "yes" and returns.

Note that this code assumes that the input list is a list of integers, and it uses the `int` function to convert each element of the input list to an integer. If the input list contains non-integer elements, you may need to modify the code accordingly.</s>
