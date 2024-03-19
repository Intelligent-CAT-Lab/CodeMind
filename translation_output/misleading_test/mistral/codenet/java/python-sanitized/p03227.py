a = input()
b = a.split()

if len(b) == 3:
    a, b[2], b[0] = b[0], b[2], a

print(''.join(b))