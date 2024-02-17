b1,b2,b3 = map(int,"0 0 1".split())
if b1 == 1:
    if b2 == 1:
        print("Open")
    else:
        print("Close")
else:
    if b2 == 1:
        print("Close")
    else:
        if b3 == 1:
            print("Open")
        else:
            print("Close")
