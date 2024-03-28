def sort_chars(t):
    return ''.join(sorted(t))

def replace_substring(dstr, mstr, nstr):
    for i in range(len(dstr) - 7):
        t = dstr[i:i+8]
        if sort_chars(mstr) == sort_chars(t):
            dstr = dstr.replace(t, nstr, 1)
            i += 7
    return dstr

def main():
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    while True:
        try:
            dstr = input()
            if len(dstr) < 8:
                print(dstr)
                continue
            dstr = replace_substring(dstr, mstr, nstr)
            print(dstr)
        except EOFError:
            break

if __name__ == "__main__":
    main()