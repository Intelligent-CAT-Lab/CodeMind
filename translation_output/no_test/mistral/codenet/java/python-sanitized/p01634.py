import sys

def main():
    br = sys.stdin
    line = ""

    while (line = br.readline()) != None and not line.strip():
        c1, c2, c3 = 0, 0, 0
        if len(line) < 6:
            print("INVALID")
        else:
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

if __name__ == "__main__":
    main()