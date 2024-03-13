import sys

def main():
    t1 = int(sys.stdin.readline())
    t2 = int(sys.stdin.readline())
    r1 = int(sys.stdin.readline())
    r2 = int(sys.stdin.readline())
    if r1 == -1 or r2 == -1:
        r1 = -t1
        r2 = -t2
    if r1 == r2:
        print("Draw")
    elif r1 < r2:
        print("Bob")
    else:
        print("Alice")

if __name__ == "__main__":
    main()