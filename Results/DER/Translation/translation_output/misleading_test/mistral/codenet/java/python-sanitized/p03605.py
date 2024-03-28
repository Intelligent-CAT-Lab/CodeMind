def p03605():
    N = int(input())
    amari = N % 10
    sho = N // 10
    if amari == 9:
        print("Yes")
    elif sho == 9:
        print("Yes")
    else:
        print("No")

def myReverse(pStr):
    if len(pStr) < 1:
        return ""
    else:
        return pStr[::-1]

def myMod(a, b):
    ret = a % b
    if ret < 0:
        ret += b
    return ret

def myPowWithMod(kisu, josu, primeNumMod_0):
    ans = 1
    if josu == 0:
        return 1
    if primeNumMod_0 == 0:
        while josu > 0:
            if josu % 2 == 0:
                kisu *= kisu
                josu = josu // 2
            else:
                ans *= kisu
                josu -= 1
        return ans
    else:
        kisu = myMod(kisu, primeNumMod_0)
        while josu > 0:
            if josu % 2 == 0:
                kisu *= myMod(kisu, primeNumMod_0)
                josu = josu // 2
            else:
                ans *= myMod(kisu, primeNumMod_0)
                josu -= 1
        return myMod(ans, primeNumMod_0)

if __name__ == "__main__":
    p03605()