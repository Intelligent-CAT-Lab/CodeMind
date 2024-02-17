d = {"lorem ipsum" : 12, "dolor" : 23}
l = ["lorem ipsum", "dolor"]
new_d = {}

for k in l:
    if d.get(k) is not None:
        new_d[k] = d[k]

print(new_d.copy())