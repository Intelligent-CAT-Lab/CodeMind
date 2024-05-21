def main():
    a, b = map(int, input().split())
    if a == 1:
        if b != 1:
            print("Alice")
    elif b == 1:
        if a != 1:
            print("Bob")
    elif a > b and a != 1 and b != 1:
        print("Alice")
    elif a < b and a != 1 and b != 1:
        print("Bob")
    else:
        print("Draw")

if __name__ == "__main__":
    main()