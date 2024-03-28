import sys

def main():
    age = int(sys.stdin.readline())
    if age == 3 or age == 5 or age == 7:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()