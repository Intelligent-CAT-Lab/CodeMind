S = "x^2+3x+2"
L = len(S)
cur = 0
P = [0]*6
def expr():
    global cur
    op = "+"
    while 1:
        term(op)
        if cur == L:
            break
        op = S[cur]
        cur += 1 # "+"/"-"
def num():
    global cur
    v = 0
    while cur < L and S[cur] in "0123456789":
        v = 10*v + int(S[cur])
        cur += 1
    return v
def term(op):
    global cur
    k = 1
    if S[cur] != 'x':
        k = num()
    d = 0
    if cur < L and S[cur] == "x":
        cur += 1 # "x"
        d = 1
        if cur < L and S[cur] == '^':
            cur += 1 # "^"
            d = num()
    P[d] = k if op == '+' else -k
expr()
def f(P, x):
    res = 0
    for i in range(6):
        res += P[i]*(x**i)
    return res
d = 5
while P[d] == 0:
    d -= 1
R = []
for x in range(2000, -2001, -1):
    if f(P, x) == 0:
        R.append(x)
print("".join("(x%+d)" % -x for x in R))
