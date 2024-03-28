class main:
    def sort(t):
        return ''.join(sorted(t))
    
    def replace_substring(dstr):
        mstr = "AADINNUY"
        nstr = "AIZUNYAN"
        if len(dstr) < 8:
            return dstr
        for i in range(len(dstr)-7):
            t = dstr[i:i+8]
            if sort(mstr) == sort(t):
                dstr = dstr.replace(t, nstr, 1)
                i += 7
        return dstr
    
    def main():
        while True:
            try:
                dstr = input()
                print(replace_substring(dstr))
            except EOFError:
                break
    
    if __name__ == "__main__":
        main()