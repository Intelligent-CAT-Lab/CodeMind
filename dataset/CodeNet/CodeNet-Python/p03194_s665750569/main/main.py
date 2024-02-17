import math


def main():
    N, P = list(map(int, input().split()))
    rt = math.floor(math.sqrt(P))
    cnt = {}
    for i in range(2, rt+1):
        while P % i == 0:
            if i not in cnt:
                cnt[i] = 0
            cnt[i] += 1
            P //= i
    if P != 1:
        cnt[P] = 1
    ans = 1
    for c in cnt:
        ans *= c**(cnt[c]//N)
    print(ans)


if __name__ == "__main__":
    main()
