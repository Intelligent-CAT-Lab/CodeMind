# 8-A
n = input()

for i in range(len(n)):
    if n[i].islower():
        print(n[i].upper(), end='')
    elif n[i].isupper():
        print(n[i].lower(), end='')
    else:
        print(n[i], end='')

print()