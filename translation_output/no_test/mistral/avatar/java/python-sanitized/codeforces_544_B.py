import sys

def printIsland(n, count):
    a = (n + 1) // 2
    b = n // 2
    max = a * a + b * b
    if count > max:
        print("NO")
        return
    print("YES")
    sb = ""
    for i in range(n):
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                sb += "L"
                count -= 1
            else:
                sb += "S"
        sb += "\n"
    print(sb)

n = int(input())
count = int(input())
printIsland(n, count)