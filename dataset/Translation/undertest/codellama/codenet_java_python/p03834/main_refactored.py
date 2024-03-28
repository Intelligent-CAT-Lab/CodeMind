class main:
    import sys
    
    with open(sys.stdin, 'r') as f:
        s = f.readline()
    
    print(s.replace(',', ' '))