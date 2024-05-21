def main():
    N = int(input())
    f = False
    for A in range(1, 10):
        if N % A == 0 and N // A < 10:
            f = True
            break
    print("Yes" if f else "No")

if __name__ == "__main__":
    main()