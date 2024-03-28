class main:
    s = input()
    array = s.split()
    
    for i in range(len(s)):
        if i % 2 == 0:
            print(array[i], end='')