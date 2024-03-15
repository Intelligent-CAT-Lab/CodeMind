<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        long x = sc.nextLong();

        while (x > 0) {
            long r = x % 10;
            if (9 - r < r) {
                if (x / 10 == 0 && 9 - r == 0)
                    list.add(r);
                else
                    list.add(9 - r);
            } else {
                list.add(r);
            }
            x = x / 10;
        }

        int pow = 0;
        long newNumber = 0;

        for (int i = 0; i < list.size(); i++) {
            newNumber = newNumber + list.get(i) * (long) Math.pow(10, pow);
            pow++;
        }

        System.out.println(newNumber);
    }
}
```

### 解答

```python
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class codeforces_514_A:
    def main(self, args):
        sc = Scanner(System.in)
        list = []
        x = sc.nextLong()

        while x > 0:
            r = x % 10
            if 9 - r < r:
                if x / 10 == 0 and 9 - r == 0:
                    list.append(r)
                else:
                    list.append(9 - r)
            else:
                list.append(r)
            x = x / 10

        pow = 0
        newNumber = 0

        for i in range(len(list)):
            newNumber = newNumber + list[i] * (long)(math.pow(10, pow))
            pow += 1

        print(newNumber)
```

### 解析

```python
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class codeforces_514_A:
    def main(self, args):
        sc = Scanner(System.in)
        list = []
        x = sc.nextLong()

        while x > 0:
            r = x % 10
            if 9 - r < r:
                if x / 10 == 0 and 9 - r == 0:
                    list.append(r)
                else:
                    list.append(9 - r)
            else:
                list.append(r)
            x = x / 10

        pow = 0
        newNumber = 0

        for i in range(len(list)):
            newNumber = newNumber + list[i] * (long)(math.pow(10, pow))
            pow += 1

        print(newNumber)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [codeforces_514_B](codeforces_514_B.md)
</s>
