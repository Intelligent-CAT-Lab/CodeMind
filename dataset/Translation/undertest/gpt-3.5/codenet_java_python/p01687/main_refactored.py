class main:
    def sort(t):
        for i in range(len(t)):
            for j in range(len(t)-1, i, -1):
                if t[i] > t[j]:
                    a = t[i]
                    t[i] = t[j]
                    t[j] = a
        return t
    
    def main():
        mstr = "AADINNUY"
        nstr = "AIZUNYAN"
        t = list("AAAAAAAA")
        tt = ""
        while True:
            try:
                dstr = input()
                if len(dstr) < 8:
                    print(dstr)
                    continue
                i = 0
                while i < len(dstr) - 7:
                    t = list(dstr[i:i+8])
                    tt = "".join(t)
                    sort(t)
                    if mstr == "".join(t):
                        dstr = dstr.replace(tt, nstr, 1)
                        i += 7
                    i += 1
                print(dstr)
            except EOFError:
                break
    
    if __name__ == "__main__":
        main()