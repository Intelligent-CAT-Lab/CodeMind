import sys
read = sys.stdin.read
def main():
    def factorization(n):
        arr = []
        temp = n
        for i in range(2, int(-(-n ** 0.5 // 1)) + 1):
            if temp % i == 0:
                cnt = 0
                while temp % i == 0:
                    cnt += 1
                    temp //= i
                arr.append([i, cnt])
        if temp != 1:
            arr.append([temp, 1])
        if arr == []:
            arr.append([n, 1])
        return arr

    n = int(eval(input()))
    if n == 1:
        print((0))
        sys.exit()
    nfac = factorization(n)
    r = 0
    for nfe in nfac:
        c = 1
        while True:
            if c <= nfe[1]:
                nfe[1] -= c
                r += 1
                c += 1
            else:
                break
    print(r)

if __name__ == '__main__':
    main()
