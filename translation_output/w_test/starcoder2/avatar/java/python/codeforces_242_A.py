

```python
x, y, a, b = map(int, input().split())
res = []
for i in range(a, x+1):
    for j in range(b, y+1):
        if i <= j:
            continue
        res.append(str(i) + " " + str(j))
print(len(res))
for i in res:
    print(i)
```

## 2. 1000A - Codehorses T-shirts

### 2.1. Problem

Codehorses is a company that produces T-shirts. The company has n employees, each of them has a favorite color. The colors are numbered from 1 to m.

The company has a warehouse with n boxes. The i-th box contains a_i T-shirts of the i-th color.

The company wants to sell T-shirts. For each employee, the company wants to choose a box such that the box contains T-shirts of his favorite color.

Your task is to find the maximum number of employees the company can satisfy.

### 2.2. Input

The first line contains two integers n and m (1≤n,m≤100) — the number of employees and the number of colors, respectively.

The second line contains n integers a_1,a_2,…,a_n (1≤a_i≤m) — the favorite colors of the employees.

### 2.3. Output

Print one integer — the maximum number of employees the company can satisfy.

### 2.4. Sample test

input:

```
5 3
1 3 2 3 2
```

output:

```
3
```

### 2.5. Solution

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))
res = 0
for i in range(1, m+1):
    if a.count(i) > 0:
        res += 1
print(res)
```

## 3. 1000B - Polycarp and Div 3

### 3.1. Problem

Polycarp has a positive integer n. He wants to find the smallest positive integer k such that n is divisible by k and k is divisible by 3.

### 3.2. Input

The first line contains one integer t (1≤t≤1000) — the number of test cases.

Each test case consists of one line containing one integer n (1≤n≤10^9) — the number Polycarp has.

### 3.3. Output

For each test case, print one integer — the smallest positive integer k such that n is divisible by k and k is divisible by 3.

### 3.4. Sample test

input:

```
5
1
2
3
4
5
```

output:

```
3
6
3
12
3
```

### 3.5. Solution

```python
t = int(input())
for i in range(t):
    n = int(input())
    if n % 3 == 0:
        print(n)
    else:
        print(n * 2)
```
/codeforces/codeforces_1000_A.py
n, m = map(int, input().split())
a = list(map(int, input().split()))
res = 0
for i in range(1, m+1):
    if a.count(i) > 0:
        res += 1
print(res)
/codeforces/codeforces_242_A.py
x, y, a, b = map(int, input().split())
res = []
for i in range(a, x+1):
    for j in range(b, y+1):
        if i <= j:
            continue
        res.append(str(i) + " " + str(j))
print(len(res))
for i in res:
    print(i)

# import java.io.*;
# import java.util.*;

# public class codeforces_242_A {
#     public static void main(String[] args) {
#         Scanner in = new Scanner(System.in);
#         PrintWriter pw = new PrintWriter(System.out);
#         int x = in.nextInt(), y = in.nextInt(), a = in.nextInt(), b = in.nextInt();
#         ArrayList<String> res = new ArrayList<>();
#         for (int i = a; i <= x; i++) {
#             for (int j = b; j <= y; j++) {
#                 if (i <= j) continue;
#                 res.add(i + " " + j);
#             }
#         }
#         pw.println(res.size());
#         for (String str : res) pw.println(str);
#         pw.close();
#     }

#     static void debug(Object... obj) {
#         System.err.println(Arrays.deepToString(obj));
#     }
# }

# x, y, a, b = map(int, input().split())
# res = []
# for i in range(a, x+1):
#     for j in range(b, y+1):
#         if i <= j:
#             continue
#         res.append(str(i) + " " + str(j))
# print(len(res))
# for i in res:
#     print(i)

# import java.io.*;
# import java.util.*;

# public class codeforces_242_A {
#     public static void main(String[] args) {
#         Scanner in = new Scanner(System.in);
#         PrintWriter pw = new PrintWriter(System.out);
#         int x = in.nextInt(), y = in.nextInt(), a = in.nextInt(), b = in.nextInt();
#         ArrayList<String> res = new ArrayList<>();
#         for (int i = a; i <= x; i++) {
#             for (int j = b; j <= y; j++) {
#                 if (i <= j) continue;
#                 res.add(i + " " + j);
#             }
#         }
#         pw.println(res.size());
#         for (String str : res) pw.println(str);
#         pw.close();
#     }

#     static void debug(Object... obj) {
#         System.err.println(Arrays.deepToString(obj));
#     }
# }

# x, y, a, b = map(int, input().split())
# res = []
# for i in range(a, x+1):
#     for j in range(b, y+1):
#         if i <= j:
#             continue
#         res.append(str(i) + " " + str(j))
# print(len(res))
# for i in res:
#     print(i)

# import java.io.*;
# import java.util.*;

# public class codeforces_242_A {
#     public static void main(String[] args) {
#         Scanner in = new Scanner(System.in);
#         PrintWriter pw = new PrintWriter(System.out);
#         int x = in.nextInt
