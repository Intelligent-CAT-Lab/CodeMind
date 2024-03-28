class main:
    s = input()
    ar = [0] * 26
    for i in range(len(s)):
        ar[ord(s[i]) - 97] += 1
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