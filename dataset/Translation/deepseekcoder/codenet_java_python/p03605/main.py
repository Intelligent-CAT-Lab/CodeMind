import sys

def main():
    N = int(input())

    amari = N % 10
    sho = N // 10

    if amari == 9 or sho == 9:
        print("Yes")
    else:
        print("No")

def my_reverse(p_str):
    if len(p_str) < 1:
        return ""

    return p_str[::-1]

def my_mod(a, b):
    ret = 0

    ret = a % b

    if ret < 0:
        ret += b

    return ret

def my_pow_with_mod(kisu, josu, primeNumMod_0):

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
        kisu = my_mod(kisu, primeNumMod_0)

        while josu > 0:
            if josu % 2 == 0:
                kisu *= my_mod(kisu, primeNumMod_0)
                josu = josu // 2
            else:
                ans *= my_mod(kisu, primeNumMod_0)
                josu -= 1

        return my_mod(ans, primeNumMod_0)

if __name__ == "__main__":
    main()