class main:
    a, b = map(int, input().split())
    
    d = a // b
    r = a % b
    f = "{:.5f}".format(