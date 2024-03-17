import sys

while True:
    line = sys.stdin.readline()
    if not line:
        break
    if len(line) < 6:
        print("INVALID")
    else:
        c1 = c2 = c3 = 0
        for c in line:
            if c >= '0' and c <= '9':
                c1 += 1
            elif c >= 'A' and c <= 'Z':
                c2 += 1
            else:
                c3 += 1
        if c1 > 0 and c2 > 0 and c3 > 0:
            print("VALID")
        else:
            print("INVALID")