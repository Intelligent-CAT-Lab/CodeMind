class main:
    a = int(input())
    b = int(input())
    kuti = 1
    tap = 0
    
    while kuti < b:
        kuti = kuti - 1 + a
        tap += 1
    
    print(tap)