import sys

def power(a, e, modP):
    ret = 1
    while e > 0:
        if e % 2 != 0:
            ret = (ret * a) % modP
        a = (a * a) % modP
        e //= 2
    return ret

def main():
    modP = 1000000007
    m, n = map(int, input().split())
    result = power(m, n, modP)
    print(result)

if __name__ == "__main__":
    main()