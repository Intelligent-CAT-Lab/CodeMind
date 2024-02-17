sknList = [300000, 200000, 100000]

x, y = list(map(int, input().split()))

prize = 0

if x == 1 and y == 1 :
    prize += 400000

if x <= 3 :
    prize += sknList[x - 1]

if y <= 3 :
    prize += sknList[y - 1]

print(prize)