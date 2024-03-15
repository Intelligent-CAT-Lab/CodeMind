n = input()

for i in range(len(n)):
    if n[i].islower():
        print(n[i].upper())
    elif n[i].isupper():
        print(n[i].lower())
    else:
        print(n[i])