x = int(input())
a = 100
count = 0
while True:
    if a >= x:
        break
    a = a + a/100
    count += 1
print(count)