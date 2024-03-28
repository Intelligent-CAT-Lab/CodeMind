class main:
    import sys
    
    s = sys.stdin.readline().strip()
    c = s[0]
    print(chr(ord(c) + 1))