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
        System.out.println(Arrays.stream(new int[]{0, 1, 2}).mapToObj(i -> "abc"[L.get(0).get(i)]).collect(Collectors.joining()));
    }
}
```

Explanation:

In Java, we can use the Scanner class to read input from the user. We can then use the `nextInt()` method to read integers from the input. We can use the `List` interface to represent the input as a list of lists. We can use the `Collections.nCopies()` method to create a list of lists with a specified number of elements. We can use the `addAll()` method to add the input lists to the list of lists.

We can then use a while loop to repeatedly merge the lists until there is only one list left. Inside the loop, we can create a temporary list to hold the merged elements. We can then use a for-each loop to iterate over all the elements in the list of lists and add them to the temporary list. We can then clear the list of lists and use another for-each loop to add the merged elements to the list of lists. We can use the `sort()` method to sort the list of lists based on the first element of each sublist.

Finally, we can use the `Arrays.stream()` method to create a stream of integers from 0 to 2. We can then use the `mapToObj()` method to map each integer to the corresponding character using a lambda expression. We can then use the `collect()` method to concatenate the resulting stream of characters into a string.<|endoftext|>
