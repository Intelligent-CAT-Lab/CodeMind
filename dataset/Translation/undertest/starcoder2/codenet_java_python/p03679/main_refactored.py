class main:
    overLimit, prevDay, overDay = map(int, input().split())
    
    if prevDay >= overDay:
        print("delicious")
    elif prevDay + overLimit < overDay:
        print("dangerous")
    else:
        print("safe")