text = 'dorfunctions'
sub = '2'
a = 0
b = len(text) - 1

while a <= b:
    c = (a + b) // 2
    if text.rfind(sub) >= c:
        a = c + 1
    else:
        b = c - 1

print(a)