def main(a, b, op):
    for i in range(op):
        if i % 2 == 0:
            b += a // 2
            a //= 2
        else:
            a += b // 2
            b //= 2
    print(a)
    print(b)

if __name__ == "__main__":
    inputs = input().split()
    a, b, op = map(int, inputs)
    main(a, b, op)