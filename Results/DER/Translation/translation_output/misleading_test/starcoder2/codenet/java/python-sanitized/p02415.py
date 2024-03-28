#8-A

n = input()

for i in n:
    if i.islower():
        print(i.upper(), end='')
    elif i.isupper():
        print(i.lower(), end='')
    else:
        print(i, end='')