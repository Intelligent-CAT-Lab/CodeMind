def main():
    n, m, d = map(int, input().split())

    s = n if d == 0 else ((n - d) * 2)
    print("{:.10f}".format(s / n / n * (m - 1)))

if __name__ == '__main__':
    main()