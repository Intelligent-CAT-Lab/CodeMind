<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9

Expected output:
5

```
import java.util.*;

public class p03213 {
static ArrayList<int[]> factorization (int n) {
    ArrayList<int[]> list = new ArrayList<int[]>();
    int tmp= n ;
    for (int i=2;i<=Math.sqrt(n);i++) {
        if (tmp%i==0) {
            int cnt=0;
            while (tmp%i==0) {
                cnt++;
                tmp/=i;
            }
            int[] x = {i, cnt};
            list.add(x);
        }
    }
    if (tmp!=1) {
        int[] x = {tmp, 1};
        list.add(x);
    }

    if (list.size()==0) {
        int[] x = {n, 1};
        list.add(x);
    }
    return list;
}
    static HashMap<Integer, Integer> map;
    static void add_map(Integer x, Integer y) {
        if (map.containsKey(x)) {
            map.put(x, map.get(x)+y);
        } else {
            map.put(x, y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        map = new HashMap<Integer, Integer>();
        for (int i=2;i<=N;i++) {
            ArrayList<int[]> list = factorization(i);
            for (int[] array : list) {
                add_map(array[0], array[1]);
            }
        }
        ArrayList<Integer> values = new ArrayList<Integer>(map.values());
        Collections.sort(values);
        Collections.reverse(values);
        int ans = 0;
        for (int i=0;i<values.size();i++) {
            if (values.get(i)>=74) {
                ans++;
            }
        }
        for (int i=0;i<values.size();i++) {
            if (values.get(i)>=24) {
                for (int j=0;j<values.size();j++) {
                    if (i==j) {
                        continue;
                    }
                    if (values.get(j)>=2) {
                        ans++;
                    }
                }
            }
        }
        for (int i=0;i<values.size();i++) {
            if (values.get(i)>=14) {
                for (int j=0;j<values.size();j++) {
                    if (i==j) {
                        continue;
                    }
                    if (values.get(j)>=4) {
                        ans++;
                    }
                }
            }
        }
        for (int i=0;i<values.size();i++) {
            if (values.get(i)>=4) {
                for (int j=i+1;j<values.size();j++) {
                    if (values.get(j)>=4) {
                        for (int k=0;k<values.size();k++) {
                            if (i==k || j==k) {
                                continue;
                            }
                            if (values.get(k)>=2) {
                                ans++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

### Response:
```python
from collections import Counter
import math

def factorization(n):
    list = []
    tmp = n
    for i in range(2, int(math.sqrt(n)) + 1):
        if tmp % i == 0:
            cnt = 0
            while tmp % i == 0:
                cnt += 1
                tmp //= i
            list.append((i, cnt))
    if tmp != 1:
        list.append((tmp, 1))
    if not list:
        list.append((n, 1))
    return list

def add_map(map, x, y):
    if x in map:
        map[x] += y
    else:
        map[x] = y

def solve(N):
    map = {}
    for i in range(2, N + 1):
        list = factorization(i)
        for array in list:
            add_map(map, array[0], array[1])
    values = list(map.values())
    values.sort(reverse=True)
    ans = 0
    for i in range(len(values)):
        if values[i] >= 74:
            ans += 1
        elif values[i] >= 24:
            for j in range(i + 1, len(values)):
                if values[j] >= 2:
                    ans += 1
        elif values[i] >= 14:
            for j in range(i + 1, len(values)):
                if values[j] >= 4:
                    ans += 1
        elif values[i] >= 4:
            for j in range(i + 1, len(values)):
                for k in range(j + 1, len(values)):
                    if values[k] >= 2:
                        ans += 1
    return ans

N = int(input())
print(solve(N))
```
<|EOT|>
