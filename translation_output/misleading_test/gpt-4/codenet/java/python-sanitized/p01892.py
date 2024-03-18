def p01892(A, B, N):
    ans = abs(A - B)
    for i in range(1, N + 1):
        for j in range(1, N + 1):
            if (i * B) % j != 0:
                continue
            ans = min(ans, abs(A - (i * B) // j))

    return ans

def main():
    A, B, N = map(int, input().split())
    result = p01892(A, B, N)
    print(result)

if __name__ == "__main__":
    main()