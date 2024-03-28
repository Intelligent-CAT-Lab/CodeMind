n = int(input())
square = n * n
odd = []
even = []

for i in range(1, square+1):
    if i % 2 == 0:
        even.append(i)
    else:
        odd.append(i)

loop = square // n
div = loop // 2

result = ""
for i in range(1, loop+1):
    for j in range(div):
        if i % 2 == 1:
            result += str(odd.pop(0)) + " " + str(even.pop()) + " "
        else:
            result += str(even.pop(0)) + " " + str(odd.pop()) + " "
    result += "\n"

print(result)