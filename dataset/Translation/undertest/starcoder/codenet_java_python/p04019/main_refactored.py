class main:
    import sys
    
    s = sys.stdin.readline().strip()
    
    if s.count('S') == s.count('N') and s.count('W') == s.count('E'):
        print('Yes')
    else:
        print('No')