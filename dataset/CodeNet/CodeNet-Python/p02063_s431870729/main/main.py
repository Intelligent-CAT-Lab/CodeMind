def inpl(): return list(map(int, input().split()))

A, B = inpl()

def calca(x):
    return x//A + x%A

X = -(-B//A)*A
Y = calca(X - X//B*B) + X//B
if -(-B//A) < Y:
    print(X)
else:
    print((-1))
