N, A, B = map(int, "5 3 2".split())
def solve():
    if A + B - 1 <= N and N <= A * B:
        if A == 1:
            return [i for i in range(N, 0, -1)]
        s = []
        q = (N - B) // (A - 1)
        r = (N - B) % (A - 1)
        if r == 0:
            q -= 1
            r = A - 1
        for i in range(B - q - 1):
            s.append(N - i)
        for i in range(r + 1):
            s.append(A * q + 1 + i)
        for i in range(q - 1, -1, -1):
            for j in range(A):
                s.append(A * i + j + 1)
        return s
    else:
        return [-1]
print(" ".join(map(str, solve())))
