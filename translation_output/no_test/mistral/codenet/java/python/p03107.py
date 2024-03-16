<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        char S0 = '0';
        int S0mas = 0;
        for(char str : S.toCharArray()){
            if(str == S0){
                ++S0mas;
            }
        }
        int S1mas = S.length() - S0mas;
        if(S0mas < S1mas){
            System.out.println(S0mas * 2);
        }else{
            System.out.println(S1mas * 2);
        }
    }
}
```
[/INST]
```python
import sys

S = input()
S0 = '0'
S0mas = 0
for char in S:
    if char == S0:
        S0mas += 1
S1mas = len(S) - S0mas
if S0mas < S1mas:
    print(S0mas * 2)
else:
    print(S1mas * 2)
```</s>
