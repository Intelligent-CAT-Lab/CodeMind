class main:
    import sys
    
    def sort(t):
        for i in range(len(t)):
            for j in range(len(t)-1,i,-1):
                if t[i] > t[j]:
                    t[i],t[j] = t[j],t[i]
        return t
    
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    t = "AAAAAAAA"
    tt = ""
    for line in sys.stdin:
        dstr = line.strip()
        if len(dstr) < 8:
            print(dstr)
            continue
        for i in range(len(dstr)-7):
            t = dstr[i:i+8]
            tt = t
            t = list(t)
            t = sort(t)
            t = "".join(t)
            if mstr == t:
                dstr = dstr.replace(tt,nstr)
                i += 7
        print(dstr)