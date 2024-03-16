def next_int():
    return int(input())

h1 = next_int()
m1 = next_int()
h2 = next_int()
m2 = next_int()
k = next_int()

h = h2 - h1
m = m2 - m1
day = (h * 60) + m

print(day - k)