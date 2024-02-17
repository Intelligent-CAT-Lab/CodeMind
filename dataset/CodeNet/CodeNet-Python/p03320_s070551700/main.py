def Ask(x):
    ans = 0
    while (x):
        ans += x % 10
        x //= 10
    return ans

def Check(x, y):
    return x * Ask(y) > y * Ask(x)


k = int(input())
no = st = 1
while (k):
    k -= 1
    print(no)
    if (Check(no + st, no + st * 10)): st *= 10
    no += st