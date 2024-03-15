<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解答

```python
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class p00341:
    def main(self, args):
        sc = Scanner(System.in)
        e = LinkedList()
        each = 0
        disinct = []

        for i in range(12):
            e.add(sc.nextInt())

        if e.stream().distinct().count() > 3:
            print("no")
            return
        Collections.sort(e)
        disinct = e.stream().distinct().toArray()
        for a in disinct:
            each = e.stream().filter(i -> i == a).count()
            if each != 4 and each != 8 and each != 12:
                print("no")
                return
        print("yes")
```

### 解析

```python
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class p00341:
    def main(self, args):
        sc = Scanner(System.in)
        e = LinkedList()
        each = 0
        disinct = []

        for i in range(12):
            e.add(sc.nextInt())

        if e.stream().distinct().count() > 3:
            print("no")
            return
        Collections.sort(e)
        disinct = e.stream().distinct().toArray()
        for a in disinct:
            each = e.stream().filter(i -> i == a).count()
            if each != 4 and each != 8 and each != 12:
                print("no")
                return
        print("yes")
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p00340](./p00340.md)
</s>
