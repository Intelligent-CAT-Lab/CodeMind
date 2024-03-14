Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
#
# File    : F.py
# Author  : Kazune Takahashi
# Created : 5/24/2020, 3:07:25 AM
# Powered by Visual Studio Code
#

dic = {
    1: 1,
    2: 1,
    3: 1,
    4: 7,
    5: 4,
    6: 1,
    7: 336,
    8: 384,
    9: 334,
    10: 220,
    11: 108,
    12: 36,
    13: 6,
    27: 976,
    28: 108,
    29: 4,
    60: 220,
    61: 1,
    124: 334,
    252: 384,
    508: 334,
    1020: 220,
    2044: 108,
    4092: 36,
    8188: 6,
    134217723: 976,
    268435451: 108,
    536870907: 4,
    1152921504606846970: 220,
    2305843009213693946: 1,
}

n = int(input())

if n in dic:
    print(dic[n])
else:
    print(-1)

```

### Response:
```java
import java.util.*;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> dic = new HashMap<>();
        dic.put(1, 1);
        dic.put(2, 1);
        dic.put(3, 1);
        dic.put(4, 7);
        dic.put(5, 4);
        dic.put(6, 1);
        dic.put(7, 336);
        dic.put(8, 384);
        dic.put(9, 334);
        dic.put(10, 220);
        dic.put(11, 108);
        dic.put(12, 36);
        dic.put(13, 6);
        dic.put(27, 976);
        dic.put(28, 108);
        dic.put(29, 4);
        dic.put(60, 220);
        dic.put(61, 1);
        dic.put(124, 334);
        dic.put(252, 384);
        dic.put(508, 334);
        dic.put(1020, 220);
        dic.put(2044, 108);
        dic.put(4092, 36);
        dic.put(8188, 6);
        dic.put(134217723, 976);
        dic.put(268435451, 108);
        dic.put(536870907, 4);
        dic.put(1152921504606846970L, 220);
        dic.put(2305843009213693946L, 1);
        if (dic.containsKey(n)) {
            System.out.println(dic.get(n));
        } else {
            System.out.println(-1);
        }
    }
}
```<|endoftext|>
