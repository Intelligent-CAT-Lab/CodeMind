Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a = list(input().split())
print(max(a, key=a.count), max(a, key=len))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> a = Arrays.asList(sc.nextLine().split(" "));
        System.out.println(Collections.max(a, Comparator.comparingInt(a::indexOf)));
        System.out.println(Collections.max(a, Comparator.comparingInt(String::length)));
    }
}
```

Explanation:

In Java, we can use the `Scanner` class to read input from the user. We can then use the `Arrays.asList()` method to convert the input string into a list of strings.

To find the maximum element in the list, we can use the `Collections.max()` method. We need to provide a `Comparator` object to compare the elements. In this case, we are using two different comparators:

1. `Comparator.comparingInt(a::indexOf)` - This comparator compares the elements based on their index in the list. For example, if the list is `["apple", "banana", "orange"]`, then the index of `"apple"` is 0, the index of `"banana"` is 1, and the index of `"orange"` is 2.

2. `Comparator.comparingInt(String::length)` - This comparator compares the elements based on their length. For example, if the list is `["apple", "banana", "orange"]`, then the length of `"apple"` is 5, the length of `"banana"` is 6, and the length of `"orange"` is 6.<|endoftext|>
