<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n //= f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a

n = int(input())
res = prime_factorize(n)
if len(res) == 1:
  print(1)
else:
  cnt = 0
  c = None
  p = 0
  l = set()
  for r in res:
    if c == r:
      p += 1
      if not p in l:
        l.add(p)
        p = 0
        cnt += 1
    else:
      l.clear()
      p = 0
      l.add(1)
      cnt += 1
      c = r
  print(cnt)
```

### Response:
```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> res = primeFactorize(n);
        if (res.size() == 1) {
            System.out.println(1);
        } else {
            System.out.println(countGroups(res));
        }
    }

    private static ArrayList<Integer> primeFactorize(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                factors.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            factors.add(n);
        }
        return factors;
    }

    private static int countGroups(ArrayList<Integer> factors) {
        int count = 0;
        Integer current = null;
        int groupSize = 0;
        Set<Integer> groupSizes = new HashSet<>();
        for (Integer factor : factors) {
            if (current == factor) {
                groupSize++;
                if (!groupSizes.contains(groupSize)) {
                    groupSizes.add(groupSize);
                    groupSize = 0;
                    count++;
                }
            } else {
                groupSizes.clear();
                groupSizes.add(1);
                count++;
                current = factor;
            }
        }
        return count;
    }
}
```

This Java code does the same thing as the Python code. It first factorizes the input number into its prime factors, then counts the number of distinct groups of consecutive factors. The groups are counted by keeping track of the current factor and the size of the current group. If a new factor is found, the group size is reset and the count is incremented. If a factor that is the same as the current one is found, the group size is incremented and the count is updated if the group size is new.
<|EOT|>
