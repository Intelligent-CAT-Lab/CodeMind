import sys

N, M, K = map(int, sys.stdin.readline().split())

for i in range(N + 1):
    for j in range(M + 1):
        if M * i + N * j - (i * j * 2) == K:
            print("Yes")
            sys.exit()

print("No")