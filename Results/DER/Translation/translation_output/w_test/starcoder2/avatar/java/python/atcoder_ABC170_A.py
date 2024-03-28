

```python
count = [int(x) for x in input().split()]

for i in range(5):
    if count[i] == 0:
        print(i + 1)
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
15


```
import java.util.*;

public class atcoder_ABC170_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= x; j++) {
                if (i * 2 + j * 4 == y && i + j == x) {
                    count++;
                }
            }
        }
        
        if (count > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

python code:

```python
x, y = [int(x) for x in input().split()]

for i in range(x + 1):
    for j in range(x + 1):
        if i * 2 + j * 4 == y and i + j == x:
            print("Yes")
            exit()

print("No")
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
15


```
import java.util.*;

public class atcoder_ABC170_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] p = new int[n];
        int min = 1000000000;
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        
        for (int i = 0; i <= 101; i++) {
            int count = 0;
            
            for (int j = 0; j < n; j++) {
                count += Math.abs(i - p[j]);
            }
            
            if (count < min) {
                min = count;
                ans = i;
            }
        }
        
        System.out.println(ans);
    }
}
```

python code:

```python
x, n = [int(x) for x in input().split()]
p = [int(x) for x in input().split()]

min = 1000000000
ans = 0

for i in range(102):
    count = 0
    for j in range(n):
        count += abs(i - p[j])

    if count < min:
        min = count
        ans = i

print(ans)
```

## 4.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
15


```
import java.util.*;

public class atcoder_ABC170_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] count = new int[1000001];
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            count[a[i]]++;
        }
        
        for (int i = 0; i < n; i++) {
            boolean ok = true;
            
            for (int j = 2; j * a[i] <= 1000000; j++) {
                if (count[j * a[i]] > 0) {
                    ok = false;
                }
            }
            
            if (ok && count[a[i]] == 1) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```

python code:

```python
n = int(input())
a = [int(x) for x in input().split()]
count = [0] * 1000001
ans = 0

for i in range(n):
    count[a[i]] += 1

for i in range(n):
    ok = True

    for j in range(2, 1000001 // a[i] + 1):
        if count[j * a[i]] > 0:
            ok = False

    if ok and count[a[i]] == 1:
        ans += 1

print(ans)
```

## 5.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
15


```
import java.util.*;

public class atcoder_ABC170_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] a = new int[n][2];
        int[] b = new int[q];
        int[] c = new int[q];
        int[] d = new int[q];
        int[] e = new int[200001];
        int[] f = new int[200001];
        int[] g = new int[200001];
        int[] h = new int[200001];
        int[] i = new int[200001];
        int[] j = new int[200001];
        int[] k = new int[200001];
        int[] l = new int[200001];
        int[] m = new int[200001];
        int[] o = new int[200001];
        int[] p = new int[200001];
        int[] r = new int[200001];
        int[] s = new int[200001];
        int[] t = new int[200001];
        int[] u = new int[200001];
        int[] v = new int[200001];
        int[] w = new int[200001];
        int[] x = new int[200001];
        int[] y = new int[200001];
        int[] z = new int[200001];
        int[] aa = new int[200001];
        int[] ab = new int[200001];
        int[] ac = new int[200001];
        int[] ad = new int[200001];
        int[] ae = new int[200001];
        int[] af = new int[200001];
        int[] ag = new int[200001];
        int[] ah = new int[200001];
        int[] ai = new int[200001];
        int[] aj = new int[200001];
        int[] ak = new int[200001];
        int[] al = new int[200001];
        int[] am = new int[200001];
        int[] an
