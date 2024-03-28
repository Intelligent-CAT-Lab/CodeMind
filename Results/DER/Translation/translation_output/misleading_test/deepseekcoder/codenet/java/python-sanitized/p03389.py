def solve(A, B, C):
    M = max(A, max(B, C))

    if (A+B+C)%2 == M%2:
        return (3*M-(A+B+C))//2
    else:
        return ((3*M+3)-(A+B+C))//2

A, B, C = map(int, input().split())
print(solve(A, B, C))