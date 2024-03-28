import sys

i = int(input())

if 1 <= i and i <= 179:
    j = 1
    while not ((i * j) % 360 == 0):
        j += 1
    print(j)
else:
    print("回転する速度は、±179°/sの範囲で入力してください。")