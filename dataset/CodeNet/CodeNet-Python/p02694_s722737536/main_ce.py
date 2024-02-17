import math
num_year = 0
t_maney = 100
x = int("103")
while t_maney < x:
    num_year += 1
    t_maney = math.floor(t_maney*1.01)
print(num_year)
