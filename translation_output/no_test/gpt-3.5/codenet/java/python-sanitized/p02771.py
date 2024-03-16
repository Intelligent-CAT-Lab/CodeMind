def main():
    A = int(input())
    B = int(input())
    C = int(input())

    if (A == B == C) or (A != B and A != C and B != C):
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()