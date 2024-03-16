def GCD(a, b):
    if a < b:
        temp = a
        a = b
        b = temp
    if a % b == 0:
        return b
    else:
        return GCD(b, a%b)

input = input().split(" ")
a = int(input[0])
b = int(input[1])

print(GCD(a, b))