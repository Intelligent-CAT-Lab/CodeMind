def main():
    N, M = (int(i) for i in input().split())
    t = 1900*M + 100*(N-M)
    p = 2**M
    print(t*p)


if __name__ == '__main__':
    main()
