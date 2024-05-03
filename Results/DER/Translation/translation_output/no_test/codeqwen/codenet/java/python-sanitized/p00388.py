def main():
    H = int(input())
    A = int(input())
    B = int(input())

    ans = 0

    for i in range(A, B+1):
        if H % i == 0:
            ans += 1

    print(ans)

if __name__ == "__main__":
    main()