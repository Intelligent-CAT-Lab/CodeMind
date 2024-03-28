import sys

N, M = map(int, input().split())
ans = 0

if N > M:
    print(M // 2)
    sys.exit(0)

if N == 1 and M == 1:
    print(0)
    sys.exit(0)

if N == 2 and M == 1:
    print(0)
    sys.exit(0)

if N * 2 > M:
    print(M // 2)
    sys.exit(0)

ans = N + ((M - N * 2) // 4)

# for (;;){
#     if (M - 2 >= (N + 1) * 2):
#         M = M - 2
#         N = N + 1
#     else:
#         break
# }

print(ans)