<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p02783 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");

            int h = Integer.valueOf(line[0]);
            int a = Integer.valueOf(line[1]);

            int n = h/a;
            if (h%a > 0) {
                n += 1;
            }

            // åºå
            System.out.println(n);
        }
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import sys

h, a = map(int, sys.stdin.readline().split())

print(h//a + (1 if h%a else 0))
```
"""
<|endoftext|>
