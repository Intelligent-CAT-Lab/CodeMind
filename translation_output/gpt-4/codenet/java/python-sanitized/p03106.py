def main():
    A = int(input())
    B = int(input())
    K = int(input())
    s = []
    z = 1
    y = 0
    while z <= A and z <= B:
        if A % z == 0 and B % z == 0:
            s.append(z)
            y += 1
        z += 1
    print(s[y - K])


if __name__ == "__main__":
    main()