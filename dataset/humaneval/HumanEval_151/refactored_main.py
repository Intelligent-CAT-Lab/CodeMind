lst = [0.2, 3, 5]
print(sum([i**2 for i in lst if i > 0 and i%2!=0 and "." not in str(i)]))