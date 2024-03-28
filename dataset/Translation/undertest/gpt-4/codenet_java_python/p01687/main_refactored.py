class main:
    def custom_sort(t):
        return sorted(t)
    
    def replace_substring(dstr, mstr, nstr):
        for i in range(len(dstr) - 7):
            t = list(dstr[i:i+8])
            tt = ''.join(t)
            if ''.join(custom_sort(t)) == mstr:
                dstr = dstr.replace(tt, nstr, 1)
                i += 7
        return dstr
    
    def main():
        mstr = "AADINNUY"
        nstr = "AIZUNYAN"
        while True:
            try:
                dstr = input().strip()
            except EOFError:  # to handle the end of input
                break  
            if len(dstr) < 8:
                print(dstr)
                continue
            print(replace_substring(dstr, mstr, nstr))
    
    # Run the program
    if __name__ == "__main__":
        main()