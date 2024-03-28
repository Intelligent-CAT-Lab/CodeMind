def main():
    S = input()
    a, b, c = 0, 0, 0
    for x in S:
        if x == 'a':
            a += 1
        if x == 'b':
            b += 1
        if x == 'c':
            c += 1
    if max(a, b, c) - min(a, b, c) <= 1:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()