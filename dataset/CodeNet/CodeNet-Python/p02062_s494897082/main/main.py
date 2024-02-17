import sys
sys.setrecursionlimit(2*10**5)
question = 1
AND = -1
OR = -2
left = -3
right = -4

tr = {'?': 1, '&': -1, '|': -2, '(': -3, ')': -4}

def evalor(L):
    if len(L) == 1:
        return L[0]
    x0, x1 = L[0]
    for i in range(1, len(L)):
        y0, y1 = L[i]
        x0, x1 = x0 + y0, min(x1, x0 + y1)
    return (x0, x1)

def push(f, s):
    if f and f[-1] == (AND, AND):
        f.pop()
        p = f.pop()
        return push(f, andeval(p, s))
    else:
        f.append(s)
        return f

def andeval(p, s):
    x0, x1 = p
    y0, y1 = s
    return (min(x0, x1 + y0), x1 + y1)
    

S = [tr[s] for s in input().strip()]
f = []
for s in S:
    if s == question:
        f = push(f, (s, s))
    elif s == AND or s == left:
        f.append((s, s))
    elif s == right:
        stack = []
        while f[-1] != (left, left):
            sp = f.pop()
            assert sp[0] > 0 and sp[1] > 0
            stack.append(sp)
        assert f.pop() == (left, left)
        push(f, evalor(stack[::-1]))
f = evalor(f)
print((*f))
