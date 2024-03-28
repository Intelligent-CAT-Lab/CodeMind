<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
1 36 3 34 5 32 
2 35 4 33 6 31 
7 30 9 28 11 26 
8 29 10 27 12 25 
13 24 15 22 17 20 

```
import java.io.*;
import java.util.*;

public class codeforces_334_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int square = n * n;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        
        for (int i = 1; i <= square; i++) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        
        int loop = square / n;
        int div = loop / 2;
        // debug(div);
        
        for (int i = 1; i <= loop; i++) {
            for (int j = 0; j < div; j++) {
                if (i % 2 == 1) {
                    pw.print(odd.remove(0) + " " + (even.remove(even.size() - 1)) + " ");
                } else {
                    pw.print(even.remove(0) + " " + (odd.remove(odd.size() - 1)) + " ");
                }
            }
            pw.println();
        }
        
        pw.close();
    }
    
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

n = int(sys.stdin.readline())

square = n * n

odd = []
even = []

for i in range(1, square + 1):
    if i % 2 == 0:
        even.append(i)
    else:
        odd.append(i)

loop = square / n
div = loop / 2

for i in range(1, loop + 1):
    for j in range(div):
        if i % 2 == 1:
            print(odd.pop(0), even.pop(), end=' ')
        else:
            print(even.pop(0), odd.pop(), end=' ')
    print()
```

'''
<|endoftext|>
