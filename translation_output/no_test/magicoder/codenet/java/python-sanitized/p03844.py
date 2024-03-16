import sys

def main():
    a = int(sys.stdin.readline())
    s = sys.stdin.readline().strip()
    b = int(sys.stdin.readline())
    c = 0
    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b
    print(c)

if __name__ == "__main__":
    main()