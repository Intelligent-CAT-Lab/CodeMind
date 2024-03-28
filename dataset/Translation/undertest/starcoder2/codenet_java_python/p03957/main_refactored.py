class main:
    s = input()
    cIndex = s.find('C')
    fIndex = s.rfind('F')
    if cIndex < 0 or fIndex < 0 or fIndex < cIndex:
        print('No')
    else:
        print('Yes')