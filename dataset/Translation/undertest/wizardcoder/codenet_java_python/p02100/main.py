import re

def parse(expr):
    # remove spaces and convert to lowercase
    expr = expr.replace(" ", "").lower()
    # split into terms
    terms = re.findall(r"[+\-]?(\d+)?x(\^(\d+))?|[+\-]?\d+", expr)
    # parse each term
    keis = [0] * 6
    for term in terms:
        if term.startswith("x"):
            if "^" in term:
                v = int(term.split("^")[1])
                if term.startswith("+"):
                    keis[v] = 1
                else:
                    keis[v] = -1
            else:
                keis[1] = 1
        elif term.startswith("-x"):
            if "^" in term:
                v = int(term.split("^")[1])
                if term.startswith("+"):
                    keis[v] = -1
                else:
                    keis[v] = 1
            else:
                keis[1] = -1
        else:
            num = int(term)
            if num > 0:
                keis[0] += num
            else:
                keis[0] -= num
    return keis

def simplify(keis):
    # simplify x^0
    for i in range(6):
        if keis[i] == 0:
            keis[i] = 0
    # simplify x^1
    if keis[1] == 1:
        keis[0] += keis[1]
        keis[1] = 0
    elif keis[1] == -1:
        keis[0] -= keis[1]
        keis[1] = 0
    # simplify x^2
    if keis[2]!= 0:
        if keis[2] > 0:
            for i in range(3, 6):
                keis[i-2] += keis[i] * i
            keis[0] += keis[2] * keis[2]
            keis[2] = 0
        else:
            for i in range(3, 6):
                keis[i-2] -= keis[i] * i
            keis[0] -= keis[2] * keis[2]
            keis[2] = 0
    # simplify x^3
    if keis[3]!= 0:
        if keis[3] > 0:
            for i in range(4, 6):
                keis[i-3] += keis[i] * i
            keis[0] += keis[3] * keis[3] * keis[1]
            keis[3] = 0
        else:
            for i in range(4, 6):
                keis[i-3] -= keis[i] * i
            keis[0] -= keis[3] * keis[3] * keis[1]
            keis[3] = 0
    # simplify x^4
    if keis[4]!= 0:
        if keis[4] > 0:
            for i in range(5, 6):
                keis[i-4] += keis[i] * i
            keis[0] += keis[4] * keis[4] * keis[1] * keis[1]
            keis[4] = 0
        else:
            for i in range(5, 6):
                keis[i-4] -= keis[i] * i
            keis[0] -= keis[4] * keis[4] * keis[1] * keis[1]
            keis[4] = 0
    # simplify x^5
    if keis[5]!= 0:
        if keis[5] > 0:
            keis[0] += keis[5] * keis[5] * keis[1] * keis[1] * keis[1]
            keis[5] = 0
        else:
            keis[0] -= keis[5] * keis[5] * keis[1] * keis[1] * keis[1]
            keis[5] = 0
    return keis

def solve(keis):
    # solve for x
    ans = []
    for i in range(1, 1001):
        result = 0
        for j in range(6):
            result += keis[j] * i ** j
        if result == 0:
            ans.append(i)
    return ans

def format_ans(ans):
    # format answer
    if len(ans) == 0:
        return "0"
    elif len(ans) == 1:
        return "x"
    else:
        return " + ".join(["x" + str(i) for i in ans])

# test case
expr = "x^2+3x+2"
keis = parse(expr)
keis = simplify(keis)
ans = solve(keis)
print(format_ans(ans)) # expected output: (x+1)(x+2)