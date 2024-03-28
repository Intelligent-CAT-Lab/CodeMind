# No need to import a scanner, as Python has built-in functions for input

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    ab = abs(a - b)
    ac = abs(a - c)
    bc = abs(b - c)
    if ac <= d or (ab <= d and bc <= d):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()