

```python
import math

a, b, h, m = map(int, input().split())

h = h / 6. * math.pi + m / 30. * math.pi / 12.
m = m / 30. * math.pi + h / 6. * math.pi * 12.
rad = h - m

res = math.sqrt(math.pow(a, 2) + math.pow(b, 2) - (2. * a * b * math.cos(rad)))

print(res)
```

## 2. 1000000007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import java.util.Scanner;

public class atcoder_ABC168_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }
        res[0] = 0;
        
        for (int i = 0; i < m; i++) {
            if (res[a[i] - 1] == -1) {
                res[a[i] - 1] = b[i];
            } else if (res[b[i] - 1] == -1) {
                res[b[i] - 1] = a[i];
            }
        }
        
        System.out.println("Yes");
        for (int i = 1; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}
```

python code:

```python
n, m = map(int, input().split())
a = [0] * m
b = [0] * m
for i in range(m):
    a[i], b[i] = map(int, input().split())

res = [-1] * n
res[0] = 0

for i in range(m):
    if res[a[i] - 1] == -1:
        res[a[i] - 1] = b[i]
    elif res[b[i] - 1] == -1:
        res[b[i] - 1] = a[i]

print("Yes")
for i in range(1, n):
    print(res[i])
```
/README.md
# atcoder-python

## 1. ABC168

[ABC168](https://atcoder.jp/contests/abc168)

## 2. ABC169

[ABC169](https://atcoder.jp/contests/abc169)

## 3. ABC170

[ABC170](https://atcoder.jp/contests/abc170)

## 4. ABC171

[ABC171](https://atcoder.jp/contests/abc171)

## 5. ABC172

[ABC172](https://atcoder.jp/contests/abc172)

## 6. ABC173

[ABC173](https://atcoder.jp/contests/abc173)

## 7. ABC174

[ABC174](https://atcoder.jp/contests/abc174)

## 8. ABC175

[ABC175](https://atcoder.jp/contests/abc175)

## 9. ABC176

[ABC176](https://atcoder.jp/contests/abc176)

## 10. ABC177

[ABC177](https://atcoder.jp/contests/abc177)

## 11. ABC178

[ABC178](https://atcoder.jp/contests/abc178)

## 12. ABC179

[ABC179](https://atcoder.jp/contests/abc179)

## 13. ABC180

[ABC180](https://atcoder.jp/contests/abc180)

## 14. ABC181

[ABC181](https://atcoder.jp/contests/abc181)

## 15. ABC182

[ABC182](https://atcoder.jp/contests/abc182)

## 16. ABC183

[ABC183](https://atcoder.jp/contests/abc183)

## 17. ABC184

[ABC184](https://atcoder.jp/contests/abc184)

## 18. ABC185

[ABC185](https://atcoder.jp/contests/abc185)

## 19. ABC186

[ABC186](https://atcoder.jp/contests/abc186)

## 20. ABC187

[ABC187](https://atcoder.jp/contests/abc187)

## 21. ABC188

[ABC188](https://atcoder.jp/contests/abc188)

## 22. ABC189

[ABC189](https://atcoder.jp/contests/abc189)

## 23. ABC190

[ABC190](https://atcoder.jp/contests/abc190)

## 24. ABC191

[ABC191](https://atcoder.jp/contests/abc191)

## 25. ABC192

[ABC192](https://atcoder.jp/contests/abc192)

## 26. ABC193

[ABC193](https://atcoder.jp/contests/abc193)

## 27. ABC194

[ABC194](https://atcoder.jp/contests/abc194)

## 28. ABC195

[ABC195](https://atcoder.jp/contests/abc195)

## 29. ABC196

[ABC196](https://atcoder.jp/contests/abc196)

## 30. ABC197

[ABC197](https://atcoder.jp/contests/abc197)

## 31. ABC198

[ABC198](https://atcoder.jp/contests/abc198)

## 32. ABC199

[ABC
