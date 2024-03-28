import sys

def sort(t):
    for i in range(len(t)):
        for j in range(len(t)-1,i,-1):
            if t[i] > t[j]:
                t[i],t[j] = t[j],t[i]
    return t

def main():
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    while True:
        try:
            dstr = sys.stdin.readline().strip()
            if len(dstr) < 8:
                print(dstr)
                continue
            for i in range(len(dstr)-7):
                t = dstr[i:i+8]
                if mstr == sort(t):
                    dstr = dstr.replace(t,nstr)
                    i += 7
            print(dstr)
        except:
            break

if __name__ == "__main__":
    main()