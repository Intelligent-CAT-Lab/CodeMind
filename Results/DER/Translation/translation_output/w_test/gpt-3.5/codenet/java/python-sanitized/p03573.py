def main():
    A, B, C = map(int, input().split())

    if A == B:
        print(C)
    elif B == C:
        print(A)
    else:
        print(B)

if __name__ == "__main__":
    main()