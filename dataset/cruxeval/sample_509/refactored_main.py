value = 5
width = 1
if value >= 0:
    print(str(value).zfill(width))

if value < 0:
    print('-' + str(-value).zfill(width))