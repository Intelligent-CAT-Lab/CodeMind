System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class p00341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> e = new LinkedList<>();
        long each;
        Object[] disinct;

        for(int i = 0; i < 12; i++) {
            e.add(sc.nextInt());
        }

        if(e.stream().distinct().count() > 3) {
            System.out.println("no");
            return;
        }
        Collections.sort(e);
        disinct = e.stream().distinct().toArray();
        for(Object a : disinct) {
            each = e.stream().filter(i -> i == a).count();
            if(each!= 4 && each!= 8 && each!= 12) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
```


Answer:
```python
import itertools

e = list(map(int, input().split()))

if len(set(e)) > 3:
    print("no")
    exit()

e.sort()

for a in set(e):
    if e.count(a) not in [4, 8, 12]:
        print("no")
        exit()

print("yes")
```<|endoftext|>
