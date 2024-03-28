class main:
    a, b, c = map(int, input().split())
    amount = 0
    time = a
    
    for i in range(2, int(c / a) + 2):
        amount += b
        time = a * i
    
    print(amount)