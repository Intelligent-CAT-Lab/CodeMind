def main():
    o, g, x = 0, 0, 0
    n, borrow = 0, 0

    o = int(input())
    n = int(input())
    g = int(input())

    for i in range(1, g+1):
        x = x + i * o

    borrow = x - n

    if borrow <= 0:
        print(0)
    else:
        print(borrow)

if __name__ == "__main__":
    main()