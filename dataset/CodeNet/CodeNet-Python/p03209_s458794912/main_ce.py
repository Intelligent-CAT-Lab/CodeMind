n,x = map(int,"2 7".split())
def f(N,X):
    if N == 0:
        return 0 if X <= 0 else 1
    elif X <= 4*(2**(N-1))-2:
        return f(N-1,X-1)
    elif X == 4*(2**(N-1))-1:
        return 2**N
    elif X <= 4*2**N - 3:
        return 2**N + f(N-1,X - 4*(2**(N-1)) + 1)
    else:
        return 2**(N+1) - 1
print(f(n,x))
            