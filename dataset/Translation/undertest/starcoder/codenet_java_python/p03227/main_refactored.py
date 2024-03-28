class main:
    import sys
    
    a = sys.stdin.readline()
    
    b = list(a)
    
    c = len(a)
    
    if c == 3:
    	b[0], b[2] = b[2], b[0]
    
    print(''.join(b))