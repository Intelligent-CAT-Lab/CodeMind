def ni(sc):
    a = [int(x) for x in list(sc.next())]
    return a[::-1]

def main():
    sc = Scanner(System.in)
    a = ni(sc)
    b = ni(sc)
    k = sc.nextInt()
    max = 0
    for i in range(1<<10):
        if bin(i).count('1') > k:
            continue
        borrow = [0]*11
        c = [0]*10
        for j in range(10):
            if a[j] - borrow[j] >= b[j]:
                c[j] = a[j] - borrow[j] - b[j]
                borrow[j+1] = 0
            else:
                c[j] = a[j] - borrow[j] + 10 - b[j]
                borrow[j+1] = 1 if (i&(1<<j)) > 0 else 0
        ans = 0
        for j in range(9,-1,-1):
            ans = ans*10 + c[j]
        max = max(max,ans)
    print(max)

main()