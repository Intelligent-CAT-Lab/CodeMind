<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解答

```python
import java.util

class p03213:
    def factorization(self, n):
        list = []
        tmp = n
        for i in range(2, int(math.sqrt(n)) + 1):
            if tmp % i == 0:
                cnt = 0
                while tmp % i == 0:
                    cnt += 1
                    tmp //= i
                list.append([i, cnt])
        if tmp != 1:
            list.append([tmp, 1])
        if list == []:
            list.append([n, 1])
        return list

    def main(self):
        n = int(input())
        map = {}
        for i in range(2, n + 1):
            list = self.factorization(i)
            for x in list:
                map[x[0]] = map.get(x[0], 0) + x[1]
        values = []
        for k, v in map.items():
            values.append(v)
        values.sort()
        values.reverse()
        ans = 0
        for v in values:
            if v >= 74:
                ans += 1
        for v in values:
            if v >= 24:
                for i in range(len(values)):
                    if i == j:
                        continue
                    if v >= 2:
                        ans += 1
        for v in values:
            if v >= 14:
                for i in range(len(values)):
                    if i == j:
                        continue
                    if v >= 4:
                        ans += 1
        for v in values:
            if v >= 4:
                for i in range(len(values)):
                    if i == j:
                        continue
                    if v >= 4:
                        for k in range(len(values)):
                            if i == k or j == k:
                                continue
                            if v >= 2:
                                ans += 1
        print(ans)
```

### 解析

```java
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
                for (int j=0;
