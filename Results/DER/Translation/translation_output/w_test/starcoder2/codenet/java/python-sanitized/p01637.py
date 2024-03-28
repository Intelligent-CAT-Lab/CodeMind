import sys

def main():
    M, rD, rR, cD, cR = map(int, sys.stdin.readline().split())
    max_jpn = -1
    D0 = (100 * cD + rD - 1) // rD
    C0 = (100 * cR + rR - 1) // rR
    for i in range(100):
        for j in range(100):
            changeD = D0 + i
            changeR = C0 + j
            jpn = M - changeD - changeR
            if jpn < 0:
                continue
            remD = changeD * rD // 100 - cD
            remR = changeR * rR // 100 - cR
            jpn += remD * 100 // rD + remR * 100 // rR
            max_jpn = max(max_jpn, jpn)
    print(max_jpn)

if __name__ == '__main__':
    main()