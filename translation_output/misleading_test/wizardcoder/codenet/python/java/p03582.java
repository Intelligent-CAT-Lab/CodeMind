Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 0

Expected output:
abab

```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<List<Integer>> L = new ArrayList<>();
        L.addAll(Collections.nCopies(a, Arrays.asList(0)));
        L.addAll(Collections.nCopies(b, Arrays.asList(1)));
        L.addAll(Collections.nCopies(c, Arrays.asList(2)));
        while (L.size() > 1) {
            List<Integer> temp = new ArrayList<>();
            for (List<Integer> l : L) {
                temp.addAll(l);
            }
            L.clear();
            for (int i = 0; i < temp.size(); i += 3) {
                L.add(Arrays.asList(temp.get(i), temp.get(i+1), temp.get(i+2)));
            }
            L.sort((l1, l2) -> l1.get(0) - l2.get(0));
        }
        System.out.println(Arrays.stream(L.get(0).stream().map(i -> new String[] {"a", "b", "c"}[i]).toArray(String[]::new)).reduce("", (s1, s2) -> s1 + s2));
    }
}
```

Explanation:

In Java, we can use the Scanner class to read input from the user. We can then use the `nextInt()` method to read integers from the input. We can use the `List` interface to represent the input as a list of lists. We can use the `Collections.nCopies()` method to create a list of lists with a specified number of elements. We can use a `while` loop to repeatedly merge the lists until there is only one list left. We can use the `addAll()` method to add the elements of the merged lists to a new list. We can use the `sort()` method to sort the new list based on the first element of each sublist. Finally, we can use the `stream()` method to convert the first element of each sublist to a string and concatenate them using the `reduce()` method.<|endoftext|>
