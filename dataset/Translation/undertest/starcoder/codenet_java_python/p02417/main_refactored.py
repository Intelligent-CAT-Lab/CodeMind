class main:
    import sys
    
    while True:
        try:
            s = input()
            d = {}
            for c in s:
                if c.isalpha():
                    d[c] = d.get(c, 0) + 1
            for k, v in d.items():
                print(k, ':', v)
        except EOFError:
            break