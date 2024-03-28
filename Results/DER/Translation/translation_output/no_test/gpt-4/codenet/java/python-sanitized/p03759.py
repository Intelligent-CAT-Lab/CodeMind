# No need to import a Scanner in Python; input() function is used

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    if a - b == b - c:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()