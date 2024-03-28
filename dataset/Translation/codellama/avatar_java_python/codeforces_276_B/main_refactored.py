class main:
    import sys
    
    s = sys.stdin.readline().strip()
    ar = [0] * 26
    
    for ch in s:
        ar[ord(ch) - ord('a')] += 1
    
    cnt_od = 0
    for i in range(26):
        if ar[i] % 2 != 0:
            cnt_od += 1
    
    if cnt_od == 0:
        print("First")
    else:
        if cnt_od % 2 == 0:
            print("Second")
        else:
            print("First")