def main():
    insn = list(map(int, input().split()))
    a, b, c, d = insn

    t = c // b
    tt = c % b
    y = a // d
    u = a % d

    while a >= 0 or c >= 0:
        c -= b
        if c <= 0:
            print("Yes")
            return
        a -= d
        if a <= 0:
            print("No")
            return

if __name__ == "__main__":
    main()