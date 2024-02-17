n = int(eval(input()))
coin = [25,10,5,1]
sum_s = 0
for i in coin:
    sent = n // i
    n %= i
    sum_s += sent
print(sum_s)
