import sys

def sort(arr):
    for i in range(len(arr)):
        for j in range(len(arr)-i-1):
            if arr[i] > arr[j]:
                arr[i], arr[j] = arr[j], arr[i]

def p01687():
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    t = "AAAAAAAA".tochar()
    tt = ""
    for dstr in sys.stdin:
        if len(dstr) < 8:
            print(dstr)
            continue
        for i in range(len(dstr)-7):
            t = dstr[i:i+8].tochar()
            tt = str(t)
            sort(t)
            if mstr == tt:
                dstr = dstr.replace(tt, nstr)
                i += 7
        print(dstr)

if __name__ == "__main__":
    p01687()