
```
import math

N = int(input())
ans = 0
for i in range(3, len(str(N))):
    ans += math.pow(3, i) - 3 * math.pow(2, i) + 3

def f(a, m):
    if m >= 0:
        return f(a + 3 * math.pow(10, m), m - 1) + f(a + 5 * math.pow(10, m), m - 1) + f(a + 7 * math.pow(10, m), m - 1)
    else:
        s = str(a)
        if s.find("3") != -1 and s.find("5") != -1 and s.find("7") != -1 and a <= N:
            return 1
        else:
            return 0

ans += f(3 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
ans += f(5 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
ans += f(7 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
print(ans)
```
/atcoder/ABC114/ABC114_C.py
import math

N = int(input())
ans = 0
for i in range(3, len(str(N))):
    ans += math.pow(3, i) - 3 * math.pow(2, i) + 3

def f(a, m):
    if m >= 0:
        return f(a + 3 * math.pow(10, m), m - 1) + f(a + 5 * math.pow(10, m), m - 1) + f(a + 7 * math.pow(10, m), m - 1)
    else:
        s = str(a)
        if s.find("3") != -1 and s.find("5") != -1 and s.find("7") != -1 and a <= N:
            return 1
        else:
            return 0

ans += f(3 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
ans += f(5 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
ans += f(7 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
print(ans)

# import math
#
# N = int(input())
# ans = 0
# for i in range(3, len(str(N))):
#     ans += math.pow(3, i) - 3 * math.pow(2, i) + 3
#
# def f(a, m):
#     if m >= 0:
#         return f(a + 3 * math.pow(10, m), m - 1) + f(a + 5 * math.pow(10, m), m - 1) + f(a + 7 * math.pow(10, m), m - 1)
#     else:
#         s = str(a)
#         if s.find("3") != -1 and s.find("5") != -1 and s.find("7") != -1 and a <= N:
#             return 1
#         else:
#             return 0
#
# ans += f(3 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
# ans += f(5 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
# ans += f(7 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
# print(ans)

# import math
#
# N = int(input())
# ans = 0
# for i in range(3, len(str(N))):
#     ans += math.pow(3, i) - 3 * math.pow(2, i) + 3
#
# def f(a, m):
#     if m >= 0:
#         return f(a + 3 * math.pow(10, m), m - 1) + f(a + 5 * math.pow(10, m), m - 1) + f(a + 7 * math.pow(10, m), m - 1)
#     else:
#         s = str(a)
#         if s.find("3") != -1 and s.find("5") != -1 and s.find("7") != -1 and a <= N:
#             return 1
#         else:
#             return 0
#
# ans += f(3 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
# ans += f(5 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
# ans += f(7 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
# print(ans)

# import math
#
# N = int(input())
# ans = 0
# for i in range(3, len(str(N))):
#     ans += math.pow(3, i) - 3 * math.pow(2, i) + 3
#
# def f(a, m):
#     if m >= 0:
#         return f(a + 3 * math.pow(10, m), m - 1) + f(a + 5 * math.pow(10, m), m - 1) + f(a + 7 * math.pow(10, m), m - 1)
#     else:
#         s = str(a)
#         if s.find("3") != -1 and s.find("5") != -1 and s.find("7") != -1 and a <= N:
#             return 1
#         else:
#             return 0
#
# ans += f(3 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
# ans += f(5 * math.pow(10, len(str(N)) - 1), len(str(N)) - 2)
# ans += f(7 *
