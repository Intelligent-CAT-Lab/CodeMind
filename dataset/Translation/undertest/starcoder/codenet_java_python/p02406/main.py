x = int(input())
a = 1
b = 0
while a <= x:
    b = a/10
    if a%3 == 0:
        print(a, end=' ')
    else:
        if b%10 == 3:
            print(a, end=' ')
    a += 1