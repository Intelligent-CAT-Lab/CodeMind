System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02664 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int count = 0;
        for (int i = 0 ; i < c.length ; i++) {
            if (c[i] == 'D' ||c[i]  ==  '?') {
                count++;
                c[i] = 'D';
            }
            System.out.print(c[i]);
        }
        System.out.print("\n");

    }

}
```


Answer:
```python
import sys

c = input().strip()
count = 0
for i in range(len(c)):
    if c[i] == 'D' or c[i] == '?':
        count += 1
        c = c[:i] + 'D' + c[i+1:]
print(c)
print(count)
```<|endoftext|>
