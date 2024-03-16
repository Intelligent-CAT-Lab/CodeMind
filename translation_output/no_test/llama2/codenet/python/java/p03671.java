<s> Translate the following python code to java and enclose your solution inside ```java```:
```
abc = list(map(int, input().split()))
abc.sort()
print(abc[0] + abc[1])
```

### Hint

- [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)
- [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)
- [Sort](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#sort-java.util.List-)
- [Split](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-)
- [Int](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)
- [Print](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html#println-java.lang.String-)

### Solution

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Integer> abc = Arrays.stream(args).map(Integer::parseInt).collect(Collectors.toList());
        abc.sort();
        System.out.println(abc.get(0) + abc.get(1));
    }
}
```
</s>
