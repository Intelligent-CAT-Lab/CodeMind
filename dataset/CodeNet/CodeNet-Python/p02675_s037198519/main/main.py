N = int(eval(input()))

hon = N % 10

if hon in [2, 4, 5, 7, 9]:
    print('hon')
elif hon in [0, 1, 6, 8]:
    print('pon')
else:
    print('bon')
