class main:
    import sys
    
    for line in sys.stdin:
        line = line.replace('.', ',')
        line = line.replace(',', '')
        tokens = line.split(' ')
        count = 0
        for token in tokens:
            if len(token) >= 3 and len(token) <= 6:
                if count > 0:
                    print(' ', end='')
                print(token, end='')
                count += 1
        if count > 0:
            print()