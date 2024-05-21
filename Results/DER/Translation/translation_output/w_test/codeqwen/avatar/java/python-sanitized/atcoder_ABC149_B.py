def main():
    A, B, K = map(int, input().split())
    n = A - K
    
    if A + B <= K:
        print("0 0")
    elif n < 0:
        print("0", B + K - A)
    else:
        print(n, B)

if __name__ == "__main__":
    main()