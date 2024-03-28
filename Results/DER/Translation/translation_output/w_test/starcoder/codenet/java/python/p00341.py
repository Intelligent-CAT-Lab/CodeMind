<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 3 4 8 9 7 3 4 5 5 5

Expected output:
no


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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    e = []
    for i in range(12):
        e.append(int(sys.stdin.readline()))
    if len(set(e)) > 3:
        print("no")
        return
    e.sort()
    if e.count(e[0])!= 4 or e.count(e[1])!= 8 or e.count(e[2])!= 12:
        print("no")
        return
    print("yes")

if __name__ == "__main__":
    main()
```
<|endoftext|>
