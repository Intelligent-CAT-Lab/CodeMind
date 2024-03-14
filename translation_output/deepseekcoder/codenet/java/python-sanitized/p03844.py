import sys

def main():
    c = 0
    a = int(sys.stdin.readline().strip())
    s = sys.stdin.readline().strip()
    b = int(sys.stdin.readline().strip())
    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b
    print(c)

if __name__ == "__main__":
    main()