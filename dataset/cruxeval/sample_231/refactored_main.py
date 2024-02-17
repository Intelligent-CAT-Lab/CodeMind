years = [1872, 1995, 1945]
a10 = sum(1 for x in years if x <= 1900)
a90 = sum(1 for x in years if x > 1910)
if a10 > 3:
    r_value = 3
elif a90 > 3:
    r_value = 1
else:
    r_value = 2
print(r_value)