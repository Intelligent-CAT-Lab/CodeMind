N = int(eval(input()))

res = 'Yes'

k = 0

while 2 ** (k + 1) - 1 <= N:
    k += 1

K = 2 ** k - 1


if N == 1:
    res = 'No'
if N == K + 1:
    res = 'No'
# print(N, K)

if N % 2 == 0:
    M = N - 1
else:
    M = N
if (M - K) % 4 == 0 and M > K:
    L = M - 2
else:
    L = M

P = N - K
if P % 2 == 0:
    P = 2

print(res)

if res == 'Yes':
    line = list(range(1, K + 1))
    line.remove(P)
    line = [1, P] + line[1:]
    
    for i in range(K - 1):
        print((line[i], line[i + 1]))
    print((line[-1], N + 1))
    for i in range(K - 1):
        print((N + line[i], N + line[i + 1]))
    if L > K:
        print((1, K + 1))
        for i in range(K + 1, L):
            print((i, i + 1))
        for i in range(K + 1, L):
            print((N + i, N + i + 1))
        print((N + L, 1))
    if M > L:
        print((N + 1, M - 1))
        print((M - 1, M))
        print((N + M - 1, N + M))
        print((N + M, N + 1))
    if N > M:
        print((N, K + 1))
        print((N + N, P))

