import sys

def main():
    x = int(sys.stdin.readline())
    sb = []
    count = 0
    a = 1
    while count < x:
        b = a // 10
        if a % 3 == 0:
            sb.append(str(a))
        else:
            while b != 0:
                if b % 10 == 3:
                    sb.append(str(a))
                    break
                b //= 10
        a += 1
        count += 1
    print(" ".join(sb))

if __name__ == "__main__":
    main()