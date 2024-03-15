import sys

def is_valid(N, M, K):
    for i in range(N+1):
        for j in range(M+1):
            if (i*M + j*N - (i*j*2)) == K:
                return True
    return False

N = int(sys.stdin.readline())
M = int(sys.stdin.readline())
K = int(sys.stdin.readline())

for i in range(N+1):
    for j in range(M+1):
        if is_valid(N, M, K):
            print("Yes")
            sys.exit(0)
print("No")