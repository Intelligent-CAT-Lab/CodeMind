
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int cnt = 0;
        for (int a = 1; a < N; a++) {
            for (int b = a + 1; b < N; b++) {
                for (int c = b + 1; c < N; c++) {
                    boolean ok = true;
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);
                    for (String x : Arrays.asList(A, B, C, D)) {
                        int y = Integer.parseInt(x);
                        if (y > 255) {
                            ok = false;
                        }
                        if (y == 0 && x.length() != 1) {
                            ok = false;
                        }
                        if (y != 0 && x.charAt(0) == '0') {
                            ok = false;
                        }
                    }
                    cnt += ok ? 1 : 0;
                }
            }
        }
        System.out.println(cnt);
    }
}
```

## 2.

Write a function that takes a list of strings and returns a list of strings that are anagrams of each other.

```
def anagrams(words):
    # your code here
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea', 'soup', 'node'])
# => [['eat', 'ate', 'tea], ['done', 'node'], ['soup']]
```

```
anagrams(['eat', 'ate', 'done', 'tea
