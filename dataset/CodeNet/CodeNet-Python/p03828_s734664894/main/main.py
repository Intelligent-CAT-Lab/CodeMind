# 素因数分解
def prime_factorization(N):
    tmp = N
    ans = []
    for i in range(2, int(N ** 0.5) + 1):
        count = 0
        while tmp % i == 0:
            tmp //= i
            count += 1
        if count != 0:
            ans.append([i, count])
    if tmp != 1:
        ans.append([tmp, 1])
    if ans == []:
        ans.append([N, 1])
    return ans


mod = 10 ** 9 + 7
N = int(eval(input()))
prime_list = [0] * N
if N == 1:
    print((1))
    exit()

for i in range(1, N+1):
    tmp_list = prime_factorization(i)
    ##print(i, tmp_list)
    for k in range(len(tmp_list)):
        prime_list[tmp_list[k][0]-1] += tmp_list[k][1]

ans = 1
for i in range(1, N):
    ans *= prime_list[i] + 1
    ans %= mod
##print(prime_list)
print(ans)