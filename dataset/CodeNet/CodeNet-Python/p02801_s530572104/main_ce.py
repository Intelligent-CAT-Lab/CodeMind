C = "a"
alpha2num = lambda c: ord(c) - ord('A') + 1
num2alpha = lambda c: chr(c+64)
a = alpha2num(C)
if a == 26:
    a = 0
b = num2alpha(a + 1)
print(b)