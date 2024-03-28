def main():
    a, b, c = map(int, input().split())
    if a >= b and a >= c:
        if b >= c:
            print(int(str(a) + str(b)) + c)
        else:
            print(int(str(a) + str(c)) + b)
    elif b >= a and b >= c:
        if a >= c:
            print(int(str(b) + str(a)) + c)
        else:
            print(int(str(b) + str(c)) + a)
    else:
        if a >= b:
            print(int(str(c) + str(a)) + b)
        else:
            print(int(str(c) + str(b)) + a)

if __name__ == "__main__":
    main()