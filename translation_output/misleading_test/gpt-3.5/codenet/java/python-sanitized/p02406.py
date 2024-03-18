def main():
    x = int(input())
    sb = []
    count = 0
    a = 1
    while count < x:
        b = a // 10
        if 3 <= x <= 10000:
            if a % 3 == 0:
                sb.append(str(a))
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        sb.append(str(a))
                        break
                    b = b // 10
        a += 1
        count += 1
    print(" ".join(sb))

if __name__ == "__main__":
    main()