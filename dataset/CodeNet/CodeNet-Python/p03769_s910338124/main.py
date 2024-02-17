
def f(n):
    if n == 1:
        return []
    if n % 2 == 0:
        r = f(n//2)
        k = len(r)
        return r + [k+1]
    if n % 2 == 1:
        r = f(n - 1)
        k = len(r)
        return [k+1] + r

n = int(input())
r = f(n+1)
k = len(r)
res = r + list(range(1, k+1))
print(len(res))
for x in res:
    print(x, end=' ')
print()

