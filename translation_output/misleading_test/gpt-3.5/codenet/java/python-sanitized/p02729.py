def main():
    n, m = map(int, input().split())

    nComb = n * (n-1) // 2
    mComb = m * (m-1) // 2

    print(nComb + mComb)

if __name__ == "__main__":
    main()