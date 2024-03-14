import sys

def main():
    x = int(sys.stdin.readline())
    sb = []
    count = 0
    a = 1
    if 3 <= x <= 10000:
        while count < x:
            b = a // 10
            if a % 3 == 0:
                sb.append(" ")
                sb.append(a)
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        sb.append(" ")
                        sb.append(a)
                        break
                    b //= 10
            a += 1
            count += 1
    print(''.join(map(str, sb)))

if __name__ == "__main__":
    main()