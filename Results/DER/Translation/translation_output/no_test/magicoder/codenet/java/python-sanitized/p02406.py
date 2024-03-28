import sys

def main():
    x = int(sys.stdin.readline())
    sb = ""
    count = 0
    a = 1
    if x >= 3 and x <= 10000:
        while count < x:
            b = a // 10
            if a % 3 == 0:
                sb += " " + str(a)
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        sb += " " + str(a)
                        break
                    b //= 10
            a += 1
            count += 1
    print(sb)

if __name__ == "__main__":
    main()