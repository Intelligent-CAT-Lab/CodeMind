class main:
    import sys
    
    res = [0] * 26
    
    for line in sys.stdin:
        for c in line:
            if c.isalpha():
                res[ord(c.lower()) - ord('a')] += 1
    
    for i in range(26):
        print(chr(i + ord('a')) + ' : ' + str(res[i]))