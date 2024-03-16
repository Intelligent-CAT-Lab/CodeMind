<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
            if(each != 4 && each != 8 && each != 12) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
```
[/INST]
```python
import java.util.LinkedList
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    e = LinkedList()
    each = 0
    distinct = []

    for i in range(12):
        e.append(sc.nextInt())

    if len(set(e)) > 3:
        print("no")
        return

    e.sort()
    distinct = list(set(e))
    for a in distinct:
        each = e.count(a)
        if each != 4 and each != 8 and each != 12:
            print("no")
            return

    print("yes")

if __name__ == "__main__":
    main()
```</s>
