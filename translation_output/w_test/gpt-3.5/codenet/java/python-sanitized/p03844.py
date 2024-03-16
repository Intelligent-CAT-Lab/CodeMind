def main():
    a, s, b = input().split()
    a, b = int(a), int(b)
    c = 0
    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b
    print(c)

if __name__ == "__main__":
    main()