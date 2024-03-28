class main:
    max = 0
    idx = 0
    for i in range(3):
        x = int(input())
        if max < x:
            max = x
            idx = i
    print(chr(ord('A') + idx))