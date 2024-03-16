<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.ArrayDeque;
import java.util.Scanner;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int x = sc.nextInt();
            if (x == 1 || x == 2 * N - 1) {
                System.out.println("No");
                break;
            }
            System.out.println("Yes");
            int low = x - 1;
            int high = x + 1;
            ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
            deq.add(x);
            while (low != 0 || high != 2 * N) {
                if (low == 0) {
                    deq.push(high);
                    deq.add(high + 1);
                    high += 2;
                } else if (high == 2 * N) {
                    deq.add(low);
                    deq.push(low - 1);
                    low -= 2;
                } else {
                    deq.push(low);
                    low--;
                    deq.add(high);
                    high++;
                }
            }
            for (int s : deq)
                System.out.println(s);
        }
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys
from collections import deque

def main():
    while True:
        N, x = map(int, input().split())
        if x == 1 or x == 2 * N - 1:
            print("No")
            break
        print("Yes")
        low = x - 1
        high = x + 1
        deq = deque([x])
        while low != 0 or high != 2 * N:
            if low == 0:
                deq.append(high)
                deq.append(high + 1)
                high += 2
            elif high == 2 * N:
                deq.append(low)
                deq.append(low - 1)
                low -= 2
            else:
                deq.append(low)
                low -= 1
                deq.append(high)
                high += 1
        for s in deq:
            print(s)

if __name__ == "__main__":
    main()
```
This is the Python code for the same logic as the Java code. The `deque` module is used to create a double-ended queue, which is similar to the `ArrayDeque` class in Java. The `map` function is used to convert the input from a string to an integer. The `while` loop is used to iterate over the input, and the `if` statements are used to check if the input is valid. If the input is valid, the `deque` is created and the loop is executed. The `for` loop is used to print the elements of the `deque`.</s>
