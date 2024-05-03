odd = 0
for i in range(3):
    odd += int(input()) % 2
print("Hom" if odd >= 2 else "Tem")