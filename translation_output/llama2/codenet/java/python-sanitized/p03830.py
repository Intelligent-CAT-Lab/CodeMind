import sys

if __name__ == '__main__':
    fptr = open(sys.argv[1], 'r')
    n = int(fptr.readline())
    cnt = [0] * (n + 1)
    for i in range(2, n + 1):
        temp = i
        for j in range(2, int(temp ** 0.5) + 1):
            while temp % j == 0:
                cnt[j] += 1
                temp //= j
        if temp > 1:
            cnt[temp] += 1
    ans = 1
    for i in range(2, n + 1):
        ans = (ans * (cnt[i] + 1)) % 1000000007
    print(ans)