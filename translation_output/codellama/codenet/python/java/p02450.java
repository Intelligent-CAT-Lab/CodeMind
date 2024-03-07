<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

from itertools import permutations
for p in list(permutations(range(1, int(input())+1))): print(*p)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                System.out.println(list);
                list.set(i, temp);
            }
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `ArrayList` class to store the list of numbers. The `for` loops are used to iterate over the list and swap the elements. The `System.out.println` method is used to print the list.

Note that this code is not optimized for performance, and it may not be the most efficient way to solve the problem. However, it should give you an idea of how to approach the problem in Java.</s>
