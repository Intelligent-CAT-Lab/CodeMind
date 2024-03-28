class main:
    w = input()
    c = list(w)
    a = ord('a')
    z = ord('z')
    count = 0
    for i in range(a, z+1):
        for x in c:
            if x == chr(i):
                count += 1
        if count % 2 == 1:
            print("No")
            return
        count = 0
    print("Yes")