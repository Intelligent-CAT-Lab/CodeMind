def sort_substring(t):
    return sorted(t)

def main():
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    while True:
        try:
            dstr = input()
        except EOFError:
            break

        if len(dstr) < 8:
            print(dstr)
            continue

        i = 0
        while i < len(dstr) - 7:
            t = dstr[i:i + 8]
            if ''.join(sort_substring(t)) == mstr:
                dstr = dstr[:i] + nstr + dstr[i + 8:]
                i += 7
            i += 1

        print(dstr)

if __name__ == "__main__":
    main()