text = "x--y-z-5-C"
d = {}
for char in text.replace('-', '').lower():
    d[char] = d[char] + 1 if char in d else 1
d = sorted(d.items(), key=lambda x: x[1])
print([val for i, val in d])