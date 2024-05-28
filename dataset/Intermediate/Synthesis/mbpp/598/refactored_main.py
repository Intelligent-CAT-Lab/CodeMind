number = 153
sum = 0
times = 0
temp = number
while temp > 0:
    times = times + 1
    temp = temp // 10
temp = number
while temp > 0:
    reminder = temp % 10
    sum = sum + (reminder ** times)
    temp //= 10
if number == sum:
    print(True)
else:
    print(False)