def main():
    n = int(input())
    m = int(input())
    d = int(input())
    
    s = n if d == 0 else ((n - d) * 2)
    print((s / n / n) * (m - 1))

if __name__ == "__main__":
    main()