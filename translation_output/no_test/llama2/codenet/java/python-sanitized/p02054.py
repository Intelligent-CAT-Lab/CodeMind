import sys

odd = 0
for i in range(3):
    odd += int(sys.stdin.readline()) % 2

print(odd >= 2, "Hom", "Tem")