<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 7;
        int res = 1;

        while (num < n) {
            num = num * 10 + 7;
            res++;
        }

        Set<Integer> set = new HashSet<>();

        while (true) {
            if (num % n == 0)
                break;
            num %= n;
            res++;
            if (!set.add(num)) {
                res = -1;
                break;
            }
            num = num * 10 + 7;
        }

        System.out.println(res);
    }
}
```

### Response:
```python
def atcoder_ABC174_C():
    n = int(input())
    num = 7
    res = 1

    while num < n:
        num = num * 10 + 7
        res += 1

    set_num = {7}

    while True:
        if num % n == 0:
            break
        num %= n
        res += 1
        if num not in set_num:
            set_num.add(num)
        else:
            res = -1
            break
        num = (num * 10 + 7) % n

    print(res)

atcoder_ABC174_C()
```
<|EOT|>
