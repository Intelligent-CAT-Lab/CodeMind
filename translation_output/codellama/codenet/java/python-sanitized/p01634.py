import sys

def main():
    while True:
        line = sys.stdin.readline()
        if not line or line.isspace():
            break
        c1, c2, c3 = 0, 0, 0
        for c in line:
            if c.isdigit():
                c1 += 1
            elif c.isalpha():
                c2 += 1
            else:
                c3 += 1
        if c1 > 0 and c2 > 0 and c3 > 0:
            print("VALID")
        else:
            print("INVALID")

if __name__ == "__main__":
    main()