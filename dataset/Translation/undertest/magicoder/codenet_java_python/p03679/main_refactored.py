class main:
    # Here your code !
    import sys
    
    line = sys.stdin.readline().split()
    
    overLimit = int(line[0])
    prevDay = int(line[1])
    overDay = int(line[2])
    
    if prevDay >= overDay:
        print("delicious")
    elif prevDay + overLimit < overDay:
        print("dangerous")
    else:
        print("safe")