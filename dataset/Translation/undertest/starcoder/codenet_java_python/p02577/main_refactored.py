class main:
    s = input()
    c = 0
    for i in s:
        c += int(i)
    if c % 9 == 0:
        print("Yes")
    else:
        print("No")