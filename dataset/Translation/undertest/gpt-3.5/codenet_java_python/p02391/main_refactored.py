class main:
    import sys
    
    CMD = input()
    str = CMD.split(" ")
    
    x = int(str[0])
    y = int(str[1])
    
    if x == y:
        print("a == b")
    elif x < y:
        print("a < b")
    else:
        print("a > b")