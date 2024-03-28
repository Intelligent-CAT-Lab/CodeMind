class main:
    import sys
    
    s = sys.stdin.readline()
    ar = [0]*26
    
    for i in range(len(s)):
        ch = s[i]
        ar[ord(ch)-97] += 1
    
    cntod = 0
    for i in range(26):
        if ar[i] % 2 != 0:
            cntod += 1
    
    if cntod == 0:
        print("First")
    else:
        if cntod % 2 == 0:
            print("Second")
        else:
            print("First")