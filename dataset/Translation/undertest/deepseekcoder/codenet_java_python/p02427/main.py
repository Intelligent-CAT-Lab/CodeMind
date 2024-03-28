n = int(input())

for i in range(2 ** n):
    temp = i
    print(f"{i}:", end="")
    for j in range(n):
        if temp % 2 == 1:
            print(f" {j}", end="")
        temp //= 2
    print()