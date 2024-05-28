list1 = [2,1,5,6,8,3,4,9,10,11,8,12]
m = 8
n = 10

sum_range = 0

for i in range(m, n+1, 1):
    sum_range += list1[i]

print(sum_range)