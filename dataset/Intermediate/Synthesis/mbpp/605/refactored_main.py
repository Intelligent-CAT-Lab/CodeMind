num = 13
if num >=1:
    for i in range(2, num//2):
        if (num % i) == 0:
            print(False)
        else:
            print(True)
            break
else:
    print(False)