from itertools import product
S = "3-2*3"
for x in "()+*-":
    S = S.replace(x, " {} ".format(x))
S = S.split()
def parse(pri, cur):
    def number():
        nonlocal cur
        if S[cur].isdigit():
            val = int(S[cur])
            cur += 1
            return val
        cur += 1
        val = expr(0)
        cur += 1
        return val
    def expr(level):
        nonlocal cur
        if level == 3:
            this = number()
        else:
            this = expr(level+1)
        while cur < len(S) and S[cur] in "+-*" and pri[S[cur]] == level:
            op = S[cur]
            cur += 1
            that = expr(level+1)
            if op == "+":
                this += that
            elif op == "-":
                this -= that
            else:
                this *= that
        return this
    return expr(0)
pri = {}
ans = -float("inf")
for P in product(range(3), repeat=3):
    pri["+"], pri["-"], pri["*"] = P
    ans = max(ans, parse(pri, 0))
print(ans)
