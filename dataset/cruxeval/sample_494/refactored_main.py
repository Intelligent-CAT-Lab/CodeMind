num = "1"
l = 3
t = ""
while l > len(num):
    t += '0'
    l -= 1
print(t + num)