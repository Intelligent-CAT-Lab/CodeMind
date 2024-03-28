def p03605():
    N = int(input())
    amari = N % 10
    sho = N // 10

    if amari == 9:
        print("Yes")
    elif sho == 9:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    p03605()