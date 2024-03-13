import sys

def sort(t):
    return ''.join(sorted(t))

def main():
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    t = "AAAAAAAA"

    for line in sys.stdin:
        dstr = line.strip()
        if len(dstr) < 8:
            print(dstr)
            continue
        for i in range(len(dstr) - 7):
            t = dstr[i:i+8]
            if sort(t) == mstr:
                dstr = dstr[:i] + nstr + dstr[i+8:]
                i += 7
        print(dstr)

if __name__ == "__main__":
    main()