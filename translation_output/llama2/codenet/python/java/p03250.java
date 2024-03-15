<s> Translate the following python code to java and enclose your solution inside ```java```:
```
abc = list(map(int, input().split()))
abc.sort()
print(int(str(abc[2]) + str(abc[1])) + abc[0])
```

### Hint

- [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)
- [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)
- [Sort](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#sort-java.util.List-)
- [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
- [Int](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)
- [Input](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
- [Split](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-)
- [Print](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html#println-java.lang.String-)

### Solution

```java
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] abc = new int[3];
        abc = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toArray(int[]::new);
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1] + abc[2]);
    }
}
```
</s>
