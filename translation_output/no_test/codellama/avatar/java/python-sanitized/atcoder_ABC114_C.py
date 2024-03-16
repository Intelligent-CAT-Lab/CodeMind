import math

def f(a, m):
    if m >= 0:
        return f(a + 3 * (10 ** m), m - 1) + f(a + 5 * (10 ** m), m - 1) + f(a + 7 * (10 ** m), m - 1)
    else:
        s = str(a)
        if s.find("3") != -1 and s.find("5") != -1 and s.find("7") != -1 and a <= N:
            return 1
        else:
            return 0

N = int(input())
S = input()
ans = 0
for i in range(3, len(S) - 1):
    ans += (3 ** i) - 3 * (2 ** i) + 3
ans += f(3 * (10 ** (len(S) - 1)), len(S) - 2)
ans += f(5 * (10 ** (len(S) - 1)), len(S) - 2)
ans += f(7 * (10 ** (len(S) - 1)), len(S) - 2)
print(ans)