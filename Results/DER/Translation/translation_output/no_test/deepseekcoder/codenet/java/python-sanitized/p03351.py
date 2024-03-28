import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    c = int(sys.stdin.readline().strip())
    d = int(sys.stdin.readline().strip())
    ab = abs(a-b)
    ac = abs(a-c)
    bc = abs(b-c)
    if ac <= d or (ab <= d and bc <= d):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()