num1 = [25, 24, 15, 4, 5, 29, 110]
num2 = [19, 20, 11, 56, 25, 233, 154]
num3 = [24, 26, 54, 48]
num1=sorted(num1)
num2=sorted(num2)
num3=sorted(num3)
result = heapq.merge(num1,num2,num3)
print(list(result))