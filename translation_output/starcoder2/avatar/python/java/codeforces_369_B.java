
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int rem = 0;
        int ones = 0;
        List<Integer> string = new ArrayList<>();
        ones = arr.get(arr.size() - 1) % arr.get(1);
        for (int i = 0; i < arr.get(1); i++) {
            string.add(Math.floorDiv(arr.get(arr.size() - 1), arr.get(1)) + (ones > 0 ? 1 : 0));
            ones--;
        }
        if (arr.get(0) != arr.get(1)) {
            rem = arr.get(arr.size() - 2) - arr.get(arr.size() - 1);
            ones = rem % (arr.get(0) - arr.get(1));
            for (int i = arr.get(1); i < arr.get(0); i++) {
                string.add(Math.floorDiv(rem, arr.get(0) - arr.get(1)) + (ones > 0 ? 1 : 0));
                ones--;
            }
        }
        for (int i = 0; i < string.size(); i++) {
            System.out.print(string.get(i) + " ");
        }
    }
}
```

## 2.

Write a program that takes a string and returns a new string with all the vowels removed.

```
input: "hello world"
output: "hll wrld"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```
input: "this is a test"
output: "ths s  tst"
```

```

