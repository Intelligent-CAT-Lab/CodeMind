<s> Translate the following python code to java and enclose your solution inside ```java```:
```
print(len(set(list(map(int, input().split())))))

```

### Input

```
1 2 3 4 5 6 7 8 9 10
```

### Output

```
10
```

### Explanation

```
len(set(list(map(int, input().split()))))
```

### Hint

- [set](https://docs.python.org/3/library/stdtypes.html#set)
- [map](https://docs.python.org/3/library/functions.html#map)
- [list](https://docs.python.org/3/library/stdtypes.html#list)
- [int](https://docs.python.org/3/library/functions.html#int)
- [split](https://docs.python.org/3/library/stdtypes.html#str.split)

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(new HashSet<>(Arrays.asList(arr))));
    }
}
```
</s>
