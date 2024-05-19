System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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
            if(each!= 4 && each!= 8 && each!= 12) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
```


Answer:
```python
from collections import Counter

def main():
    cards = list(map(int, input().split()))
    counter = Counter(cards)
    if len(counter) > 3:
        print("no")
        return
    for value, count in counter.items():
        if count not in (4, 8, 12):
            print("no")
            return
    print("yes")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    "1 1 3 4 8 9 7 3 4 5 5 5",
    "1 1 1 1 1 1 1 1 1 1 1 1",
    "1 2 3 4 5 6 7 8 9 10 11 12",
    "1 2 3 4 5 6 7 8 9 10 11 13",
]

for test_case in test_cases:
    input_value = test_case
    expected_output = "yes" if "no" not in test_case else "no"
    with open("input.txt", "w") as input_file:
        input_file.write(input_value)
    with open("output.txt", "w") as output_file:
        main()
        output_file.write(output_file.read())
    with open("output.txt", "r") as output_file:
        actual_output = output_file.read().strip()
    assert actual_output == expected_output, f"Expected {expected_output}, but got {actual_output} for input {input_value}"
```<|endoftext|>
