<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

from collections import Counter

S = list(input())
C = Counter(S)

o = []

for a in C.keys():
    j = 0
    m = 0
    for b in S:
        if a == b:
            j = 0
        else:
            j += 1
            m = max(m,j)
    o.append(m)

print(min(o))

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        ArrayList<Character> SList = new ArrayList<Character>();
        for (int i = 0; i < S.length(); i++) {
            SList.add(S.charAt(i));
        }

        ArrayList<Integer> o = new ArrayList<Integer>();
        for (int i = 0; i < SList.size(); i++) {
            int j = 0;
            int m = 0;
            for (int j = 0; j < SList.size(); j++) {
                if (SList.get(i) == SList.get(j)) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            o.add(m);
        }

        int min = Collections.min(o);
        System.out.println(min);
    }
}
```
This is the Java code for the above Python code. It uses the `Scanner` class to read the input string, and then it converts the string to an `ArrayList` of characters using a `for` loop. It then uses another `for` loop to iterate over the `ArrayList` and calculate the maximum number of consecutive characters that are not the same as the current character. Finally, it prints the minimum value of the `ArrayList` using the `Collections.min()` method.</s>
