<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
aatt

Expected output:
38

```
import sys
from fractions import gcd
from itertools import groupby as gb
from itertools import permutations as perm
from collections import Counter as C
from collections import defaultdict as dd
sys.setrecursionlimit(10**5)

s = input()
s = sorted(s)
g = gb(s)
l = len(s)

res = l * (l - 1) // 2 + 1
for k, v in g:
    p = len(list(v))
    res -= p * (p - 1) // 2
print(res)

```
[/INST]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String sortedInput = sortString(input);
        int[] counts = getCounts(sortedInput);
        int result = getResult(counts);
        System.out.println(result);
    }

    private static String sortString(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private static int[] getCounts(String sortedInput) {
        int[] counts = new int[26];
        for (int i = 0; i < sortedInput.length(); i++) {
            char c = sortedInput.charAt(i);
            counts[c - 'a']++;
        }
        return counts;
    }

    private static int getResult(int[] counts) {
        int result = 0;
        for (int i = 0; i < counts.length; i++) {
            int count = counts[i];
            result += count * (count - 1) / 2;
        }
        return result;
    }
}
```
This solution uses the `Scanner` class to read the input from the user, and the `Arrays` class to sort the input string. The `getCounts` method uses a `for` loop to iterate over the sorted input string and count the number of occurrences of each character. The `getResult` method uses a `for` loop to iterate over the counts array and calculate the result.

Note that this solution assumes that the input string only contains lowercase letters. If the input string can contain uppercase letters as well, you will need to modify the `getCounts` method to handle that case.</s>
