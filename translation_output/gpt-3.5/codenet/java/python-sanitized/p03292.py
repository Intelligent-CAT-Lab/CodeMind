def main():
    T = int(input())
    R = int(input())
    Y = int(input())

    A = max(T, R, Y)
    B = min(T, R, Y)

    print(A - B)

if __name__ == '__main__':
    main()